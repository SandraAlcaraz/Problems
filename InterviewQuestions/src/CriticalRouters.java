

import java.util.*;

public class CriticalRouters {

    //You are given an undirected connected graph.
    // An articulation point (or cut vertex) is defined as a vertex which,
    // when removed along with associated edges, makes the graph disconnected (or more precisely, increases the number of connected components in the graph).
    // The task is to find all articulation points in the given graph.
    //
    //Input:
    //The input to the function/method consists of three arguments:
    //
    //numNodes, an integer representing the number of nodes in the graph.
    //numEdges, an integer representing the number of edges in the graph.
    //edges, the list of pair of integers - A, B representing an edge between the nodes A and B.
    //Output:
    //Return a list of integers representing the critical nodes.



    public static ArrayList<Integer> getOneNode(Map<Integer,ArrayList<Integer>> map){
        ArrayList<Integer> oneConnexionNodes= new ArrayList<>();

        for (int  key: map.keySet()){
            if(map.get(key).size()==1){
                oneConnexionNodes.add(key);
            }
        }

        return oneConnexionNodes;
    }


    public static ArrayList<Integer> getConnextionsToOneNodes( Map<Integer,ArrayList<Integer>> map, ArrayList<Integer> arrayList){
        ArrayList<Integer> connexions= new ArrayList<>();
        for(Integer e: arrayList){
            for (Integer a: map.get(e)){
                connexions.add(a);
            }

        }

        return connexions;
    }

    public static HashMap<Integer, ArrayList<Integer>> getMap(int edges [][]){
        HashMap<Integer,ArrayList<Integer>> hashMap= new HashMap<>();
        for(int i=0; i<edges.length; i++){
            hashMap.put(i, new ArrayList<>());
        }
        for (int [] edge: edges){
            hashMap.get(edge[0]).add(edge[1]);
            hashMap.get(edge[1]).add(edge[0]);
        }
        System.out.println(hashMap);
        return hashMap;
    }

    public static ArrayList<Integer> getOtherCriticalConnexions(ArrayList<Integer> oneNode, ArrayList<Integer> conexions, Map<Integer,ArrayList<Integer>> map){
        ArrayList<Integer> arrayList= new ArrayList<>();
        ArrayList <Integer> set;
        for(Integer c: conexions){
            set=map.get(c);
            if(set.size()==2){
                set.removeAll(oneNode);
                arrayList.addAll(set);
            }

    }
        System.out.println(arrayList);
        return arrayList;
    }


    public static ArrayList<Integer> getCriticalNodes(int numNodes, int numEdges, int edges [][]){
        Map map= getMap(edges);
        ArrayList< Integer> oneNode=getOneNode(map);
        ArrayList<Integer> connexions= getConnextionsToOneNodes(map, oneNode);
        ArrayList <Integer> other= getOtherCriticalConnexions(oneNode, connexions, map);
        connexions.addAll(other);
        System.out.println();
        return connexions;

    }



    public static void main(String[] args) {
        int numNodes = 7;
        int numEdges = 7;
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 5}, {5, 6}, {3, 4}};
        System.out.println(getCriticalNodes(numNodes, numEdges, edges));
    }
}
