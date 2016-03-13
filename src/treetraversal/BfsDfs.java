package treetraversal;

import java.util.*;

/**
 * Created by Sathvik on 10/02/16.
 */

public class BfsDfs {

    public static void main(String[] args) {

        int[][] a = new int[][]{
                {0, 1, 1, 1, 0, 0},
                {1, 0, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0}
        };

        int[][] b = new int[][]{
                {0, 1, 1, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 1, 0, 0}
        };

        //bfs(a);
        bfs(b);
        //dfs(a);
        dfs(b);

    }

    private static void bfs(int[][] a) {
        List<Integer> output = new ArrayList<Integer>();
        Set<Integer> visitedSet = new HashSet<Integer>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        visitedSet.add(1);
        output.add(1);

        //int i=0;
        while (!queue.isEmpty()) {
            System.out.println();
            System.out.println("Queue: " + queue);
            int currentNode = queue.poll();
            System.out.println("Curr node: " + currentNode);
            //output.add(currentNode);
            for (int i = 0; i < a.length; i++) {
                if (a[currentNode - 1][i] == 1) {
                    if (!visitedSet.contains(i + 1)) {
                        queue.offer(i + 1);
                        output.add(i + 1);
                        visitedSet.add(i + 1);
                    }
                }
            }
        }

        System.out.println(output);

    }

    private static void dfs(int[][] a) {
        List<Integer> output = new ArrayList<Integer>();
        Set<Integer> visitedSet = new HashSet<Integer>();
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        visitedSet.add(1);
        output.add(1);
        boolean hasUnVisited = false;

        while (!stack.isEmpty()) {
            System.out.println(stack);
            int currentNode = stack.peek();
            for (int i = 0; i < a.length; i++) {
                if (a[currentNode - 1][i] == 1) {
                    hasUnVisited = false;
                    if (!visitedSet.contains(i + 1)) {
                        stack.push(i + 1);
                        output.add(i + 1);
                        visitedSet.add(i + 1);
                        hasUnVisited = true;
                        break;
                    }
                }
            }

            if (!hasUnVisited) {
                stack.pop();
            }

        }
        System.out.println(output);
    }

}
