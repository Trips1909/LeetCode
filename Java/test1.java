import java.util.*;
public class test1 {
    private int[] parent;

    public int maximumMinimumPath(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        parent = new int[rows * cols];
        List<int[]> cells = new ArrayList<>();
      
        // Initialize union find structure and list of grid cells.
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                cells.add(new int[] {grid[i][j], i, j});
                parent[i * cols + j] = i * cols + j;
            }
        }
      
        // Sort the cells based on their value in descending order.
        cells.sort((cell1, cell2) -> cell2[0] - cell1[0]);
      
        // Visited array to keep track of visited cells.
        boolean[][] visited = new boolean[rows][cols];
      
        // Directions for exploring adjacent cells (up, right, down, left)
        int[] directions = {-1, 0, 1, 0, -1};
      
        // Variable to store the maximum minimum value in a path.
        int maxMinValue = 0;
      
        // Process each cell starting with the highest value until we connect top-left to bottom-right.
        for (int i = 0; find(0) != find(rows * cols - 1); ++i) {
            int[] current = cells.get(i);
            visited[current[1]][current[2]] = true;
            maxMinValue = current[0];
          
            // Explore adjacent cells.
            for (int k = 0; k < 4; ++k) {
                int x = current[1] + directions[k];
                int y = current[2] + directions[k + 1];
                if (x >= 0 && x < rows && y >= 0 && y < cols && visited[x][y]) {
                    union(find(x * cols + y), find(current[1] * cols + current[2]));
                }
            }
        }
        return maxMinValue;
    }

    // Find operation of union find with path compression.
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // Union operation for union find.
    private void union(int x, int y) {
        parent[find(x)] = find(y);
    }
}
