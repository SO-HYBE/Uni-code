


# ----------------------- Name: Sohybe Ibrahim Abdelwahab Amer ------------------------------
# ----------------------------      ID: 222250182     ---------------------------------------

import numpy as np

def find_root(label, parents):
    """Find the root representative for a label with path compression."""
    root = label
    while root != parents[root]:
        root = parents[root]

    while label != root:
        parent = parents[label]
        parents[label] = root
        label = parent

    return root


def union(label1, label2, parents):
    """Merge the sets of two labels."""
    root1 = find_root(label1, parents)
    root2 = find_root(label2, parents)
    if root1 != root2:
        if root1 < root2:
            parents[root2] = root1
        else:
            parents[root1] = root2


# ---------------------------------------------------

def label_components_numpy(image):

    if image.size == 0:
        return np.array([[]])

    height, width = image.shape

    labels = np.zeros_like(image, dtype=int)

    parents = [0]
    current_label = 1

    for r in range(height):
        for c in range(width):

            if image[r, c] == 0:
                continue

            neighbors = []
            if r > 0 and labels[r - 1, c] > 0:  # Top neighbor
                neighbors.append(labels[r - 1, c])
            if c > 0 and labels[r, c - 1] > 0:  # Left neighbor
                neighbors.append(labels[r, c - 1])

            if not neighbors:
                labels[r, c] = current_label
                parents.append(current_label)  # Add new label to DSU
                current_label += 1
            else:
                min_label = min(neighbors)
                labels[r, c] = min_label

                for label in neighbors:
                    if label != min_label:
                        union(min_label, label, parents)


    num_labels = len(parents)
    parents = np.array(parents, dtype=int)

    for i in range(1, num_labels):
        parents[i] = find_root(i, parents)

    unique_roots = np.unique(parents)

    mapping = np.zeros(num_labels, dtype=int)

    mapping[unique_roots[1:]] = np.arange(1, len(unique_roots))

    output_image = mapping[parents[labels]]

    return output_image


# --- Example Usage ---

# 1 = foreground, 0 = background
binary_image = np.array([
    [1, 0, 1, 0, 0, 0],
    [1, 1, 1, 0, 1, 1],
    [0, 0, 0, 0, 1, 1],
    [0, 0, 0, 0, 0, 0],
    [1, 1, 0, 0, 1, 0]
])

print("--- Original Binary Image ---")
print(binary_image)

labeled_image = label_components_numpy(binary_image)

print("\n--- Labeled Components Image ---")
print(labeled_image)