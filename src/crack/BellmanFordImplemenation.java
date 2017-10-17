package crack;

public class BellmanFordImplemenation {

	/*
	 * finds the shortest path in a graph using bellmanford Algorithm.
	 * 
	 * @param graph the adjacency list of the graph.
	 * 
	 * @param weights is the array that contains the weights of the edges.
	 * 
	 * @return array of the shortest distance from the src to each vertices.
	 */
	public int[] findMinimunPathBF(int src, int[][] graph) {
		// The distance from the src to each vertices.
		int[] dist = new int[graph.length];
		// Maximizing the distance of the sre to all the vertices.
		for (int i = 0; i < dist.length; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		dist[src] = 0;

		// Loop |v|-1 times, For each edge in the graph.
		for (int k = 0; k < graph.length - 1; k++) {
			// For each edge in the graph. 
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph.length; j++) {
					// Relax edge(i, j).
					if (graph[i][j] != 0) {
						if (dist[i] != Integer.MAX_VALUE
								&& dist[j] > dist[i] + graph[i][j]) {
							dist[j] = dist[i] + graph[i][j];
						}
					}
				}
			}
		}
		// Check if there is a negative cycle, loop the edges.
		for (int i = 0; i < graph.length; i++) {
			// For each edge in the graph.
			for (int j = 0; j < graph.length; j++) {
				if (graph[i][j] != 0) {
					// Still can relax the edges?.
					if (dist[i] != Integer.MAX_VALUE
							&& dist[j] > dist[i] + graph[i][j]) {
						// Put a sign of having a negative cycle.
						dist[0] = Integer.MIN_VALUE;
						return dist;
					}
				}
			}
		}
		return dist;
	}
}