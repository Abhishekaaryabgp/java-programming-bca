// import java.util.Scanner;

// public class Fibonacchi {

// public static void main(String[] args) {
// int n = 0;
// int n1 = 1;
// int n2;

// System.out.println("Hey Enter your number Dear Sir! ...");
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// for (int i = 2; i < num; i++) {
// n2 = n + n1;
// System.out.println(n2);
// n = n1;
// n1 = n2;
// }

// sc.close();
// }
// }
/*
 * import java.util.*;
 * 
 * public class Fibonacchi {
 * 
 * public static boolean canFinishGame(int M, int N, List<List<Integer>>
 * conditions) {
 * // Initialize the result
 * boolean canFinish = false;
 * 
 * // Create a graph
 * List<List<Integer>> adj = new ArrayList<>();
 * for (int i = 0; i < N; i++) {
 * adj.add(new ArrayList<>());
 * }
 * for (List<Integer> condition : conditions) {
 * for (int j = 1; j < condition.size(); j++) {
 * if (condition.get(j) != -1) {
 * adj.get(condition.get(j)).add(i);
 * }
 * }
 * }
 * 
 * // Find the connected components of the graph
 * List<Boolean> visited = new ArrayList<>(N);
 * int numComponents = 0;
 * for (int i = 0; i < N; i++) {
 * if (!visited.get(i)) {
 * numComponents++;
 * Queue<Integer> q = new LinkedList<>();
 * q.add(i);
 * visited.set(i, true);
 * while (!q.isEmpty()) {
 * int u = q.poll();
 * for (int v : adj[u]) {
 * if (!visited.get(v)) {
 * visited.set(v, true);
 * q.add(v);
 * }
 * }
 * }
 * }
 * }
 * 
 * // Check if the number of components is 1
 * if (numComponents == 1) {
 * canFinish = true;
 * }
 * 
 * // Return the result
 * return canFinish;
 * }
 * 
 * public static void main(String[] args) {
 * // Input the number of protagonists and chapters
 * int M, N;
 * Scanner sc = new Scanner(System.in);
 * M = sc.nextInt();
 * N = sc.nextInt();
 * 
 * // Input the conditions for each chapter
 * List<List<Integer>> conditions = new ArrayList<>();
 * for (int i = 0; i < M; i++) {
 * conditions.add(new ArrayList<>());
 * for (int j = 0; j < N; j++) {
 * conditions.get(i).add(sc.nextInt());
 * }
 * }
 * 
 * // Check if the game can be finished
 * boolean canFinish = canFinishGame(M, N, conditions);
 * 
 * // Print the result
 * System.out.println(canFinish ? "1" : "0");
 * sc.close();
 * 
 * return;
 * }
 * }
 */