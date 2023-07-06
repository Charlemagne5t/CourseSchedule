import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adjacencyList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, visited, adjacencyList)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int i, int[] visited, List<List<Integer>> adjacencyList) {
        if (visited[i] == 1) {
            return false;
        }

        if (visited[i] == 2) {
            return true;
        }

        visited[i] = 1;

        for (int j = 0; j < adjacencyList.get(i).size(); j++) {
            if (!dfs(adjacencyList.get(i).get(j), visited, adjacencyList)) {
                return false;
            }
        }
        visited[i] = 2;

        return true;
    }
}
