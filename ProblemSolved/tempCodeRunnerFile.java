   int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("FOund kay at (" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row--;
            }
        }
        System.out.println("Key not foiiund");
        return false;
    }