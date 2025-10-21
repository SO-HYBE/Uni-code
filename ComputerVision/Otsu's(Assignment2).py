import numpy as np
import matplotlib.pyplot as plt

def otsu_threshold(img):
    hist, _ = np.histogram(img, bins=256, range=(0, 256))
    total = img.size
    prob = hist / total

    max_var = 0
    best_t = 0

    for t in range(1, 256):
        w0 = np.sum(prob[:t])
        w1 = np.sum(prob[t:])
        if w0 == 0 or w1 == 0:
            continue

        m0 = np.sum(np.arange(t) * prob[:t]) / w0
        m1 = np.sum(np.arange(t, 256) * prob[t:]) / w1

        var_between = w0 * w1 * (m0 - m1) ** 2
        if var_between > max_var:
            max_var = var_between
            best_t = t

    return best_t


np.random.seed(42)
background = np.random.normal(80, 20, (100, 100)).astype(np.uint8)
foreground = np.random.normal(180, 20, (100, 100)).astype(np.uint8)

image = background.copy()
y, x = np.ogrid[:100, :100]
mask = (x - 50) ** 2 + (y - 50) ** 2 <= 30 ** 2
image[mask] = foreground[mask]

t = otsu_threshold(image)
binary = image > t

fig, ax = plt.subplots(1, 3, figsize=(15, 5))

ax[0].imshow(image, cmap='gray')
ax[0].set_title("Original Image")
ax[0].axis('off')

ax[1].hist(image.ravel(), bins=256, color='gray')
ax[1].axvline(t, color='r', linestyle='--', linewidth=2)
ax[1].set_title(f"Histogram (Threshold = {t})")

ax[2].imshow(binary, cmap='gray')
ax[2].set_title("After Otsu Thresholding")
ax[2].axis('off')

plt.show()
