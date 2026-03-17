package Day8;

import Stack1.stack1;

public class floyd {
    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();   
        }
    }

    public static void floydWarshall(int[][] graph,int V){
        int[][] dist = new int[V][V];
        int i, j,k ;
        for (i = 0; i < V; i++) {
            for ( j = 0; j < V; j++) {
                for ( k = 0; k < V; k++) {
                    // if(dist[j][i] + )
                    
                }             
            }
            
        }
    }

    public static void main(String[] args) {
         int  INF = 999999999;
        int[][] graph =  {{0,5,INF,10},{INF,0,3,INF},{INF,INF,0,1},{INF,INF,INF,0}};
        printArray(graph);

        int v = graph.length;
        
    }
}