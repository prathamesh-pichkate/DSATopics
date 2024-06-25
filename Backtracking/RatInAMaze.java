// Question : 
// Rat in a Maze
// You are given a starting position for a rat which is stuck in a maze at an initial point(0,0)(the maze can be though to fasa 2-dimensional plane).The maze would be given in the form of a square matrix of order N*N where the cell swith value 0 represent the maze’s blocked locations while value 1 is the open/ available path that the rat can take to reach its destination.The rat's destination is at (N - 1, N - 1).Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.The possible directions that it can take to move in the maze are'U'(up)i.e.(x,y-1),'D'(down)i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).

// It is blocked at the positions:
// (1,0), (1,2), (3,1)

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    static int count = 0;

   
    public static boolean isSafe(int[][] maze, boolean[][] visited, int x, int y) {
        int N = maze.length;
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1 && !visited[x][y]);
    }

    public static void findPaths(int[][] maze, int x, int y, boolean[][] visited, String path, List<String> paths) {
        int N = maze.length;

        if (x == N - 1 && y == N - 1) {
            paths.add(path);
            count++;
            return;
        }

        visited[x][y] = true;

        // Move down
        if (isSafe(maze, visited, x + 1, y)) {
            findPaths(maze, x + 1, y, visited, path + 'D', paths);
        }

        // Move up
        if (isSafe(maze, visited, x - 1, y)) {
            findPaths(maze, x - 1, y, visited, path + 'U', paths);
        }

        // Move right
        if (isSafe(maze, visited, x, y + 1)) {
            findPaths(maze, x, y + 1, visited, path + 'R', paths);
        }

        // Move left
        if (isSafe(maze, visited, x, y - 1)) {
            findPaths(maze, x, y - 1, visited, path + 'L', paths);
        }

        // Unmark the current cell as visited (backtracking)
        visited[x][y] = false;
    }

    public static void main(String[] args) {
        int[][] maze = {
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
            { 1, 1, 1, 1 },
        };

        int N = maze.length;
        boolean[][] visited = new boolean[N][N];
        List<String> paths = new ArrayList<>();

        findPaths(maze, 0, 0, visited, "", paths);

        System.out.println("All possible paths from (0,0) to (" + (N - 1) + "," + (N - 1) + "):");
        for (String path : paths) {
            System.out.println(path);
        }

        // Print the total number of paths
        System.out.println("Total Counts are : " + count);
    }
}
