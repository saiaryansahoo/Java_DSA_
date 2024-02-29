package HashSetAndMap;

import java.util.*;
public class HashMapCode{
    static class HashMap<K,V>{
        private class Node {//defines node for a Linked List
            K key;
            V value;

            public Node(K key, V value) {
                this.key=key;
                this.value=value;
            }
        }
        private int n;//total no. of nodes
        private int N;//total no. of buckets
        private LinkedList<Node>bucket[];

        public HashMap(){
            this.N=4;
            this.bucket=new LinkedList[4];
            for (int i = 0; i < bucket.length; i++) {
                this.bucket[i]=new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searchInLL(K key,int bi){
           LinkedList<Node> ll=bucket[bi];
           int di=0;
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key==key){
                    return i;//di=i
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[]=bucket;
            bucket=new LinkedList[N*2];
            for (int i = 0; i < N*2; i++) {
                bucket[i]=new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll=oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        
        
        public void put(K key, V value) {
            int bi=hashFunction(key);//bi=bucket index
            int di=searchInLL(key, bi);//di=data index, di=-1
            if(di==-1){//key doesn't exists
                bucket[bi].add(new Node(key,value));
                n++;
            }else{//key exists
                Node node=bucket[bi].get(di);
                node.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                //rehashing
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);
            if(di==-1){
                return false;
            }else{
                Node node=bucket[bi].get(di);
                return true;
            }
        }

        public V remove(K key) {
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);
            if(di==-1){
                return null;
            }else{
                Node node=bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi=hashFunction(key);
            int di=searchInLL(key, bi);
            if(di==-1){
                return null;
            }else{
                Node node=bucket[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for (int i = 0; i < bucket.length; i++) {
                LinkedList<Node> ll=bucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node=ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n==0;
        }
    }
}
