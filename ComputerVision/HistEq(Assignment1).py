import matplotlib.pyplot as plt
import numpy as np

def read_image(path):

    img = plt.imread(path)
    if len(img.shape) == 3:
        img = np.dot(img[..., :3], [0.2989, 0.587, 0.114])
    img = (img * 255).astype(np.uint8) if img.max() <= 1 else img.astype(np.uint8)
    return img

def compute_histogram(img, levels=256):
    hist = [0] * levels
    for row in img:
        for pixel in row:
            hist[int(pixel)] += 1
    return hist

def compute_cdf(hist):
    cdf = [0] * len(hist)
    cdf[0] = hist[0]
    for i in range(1, len(hist)):
        cdf[i] = cdf[i - 1] + hist[i]
    return cdf

def equalize_image(img, levels=256):
    M, N = img.shape
    hist = compute_histogram(img, levels)
    cdf = compute_cdf(hist)
    cdf_min = min(x for x in cdf if x > 0)
    denominator = (M * N - cdf_min)

    if denominator == 0:  # avoid division by zero
        return img.copy()

    lut = [round((levels - 1) * (c - cdf_min) / denominator) for c in cdf]
    new_img = [[lut[int(p)] for p in row] for row in img]
    return np.array(new_img, dtype=np.uint8)

# --- MAIN ---
path = r"C:\Users\HYBE\Desktop\HYBE\Projects\Uni-code\ComputerVision\Assets\ss.jpg"  # full path
image = read_image(path)

orig_hist = compute_histogram(image)
equalized = equalize_image(image)
equal_hist = compute_histogram(equalized)

# Show histograms
plt.figure()
plt.bar(range(256), orig_hist, width=1)
plt.title("Original Histogram")

plt.figure()
plt.bar(range(256), equal_hist, width=1)
plt.title("Equalized Histogram")

# Show images
plt.figure(figsize=(10, 4))
plt.subplot(1, 2, 1)
plt.imshow(image, cmap='gray')
plt.title("Original Image")
plt.axis('off')
plt.subplot(1, 2, 2)
plt.imshow(equalized, cmap='gray')
plt.title("Equalized Image")
plt.axis('off')
plt.show()

print(type(image))
print(image.shape)
print(image.dtype)
print(np.min(image), np.max(image))
