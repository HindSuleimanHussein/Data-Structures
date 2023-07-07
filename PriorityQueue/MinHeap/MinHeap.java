import java.util.Arrays;

public class MinHeap <Hind extends Comparable<Hind>> implements MinHeapInterface<Hind>{

	private Hind[] pq;
	private int n;
	
	public MinHeap(int capacity){
		pq=(Hind[]) new Comparable[capacity+1];
	}
	
	private void swim(int k){
		while(k>1 && greater(k/2, k)){
			exch(k, k/2);
			k=k/2;
		}
	}
	
	private boolean greater(int i, int j){
		return pq[i].compareTo(pq[j])>0;
	}
	
	private void exch(int i, int j){
		Hind t=pq[i];
		pq[i]=pq[j];
		pq[j]=t;
		
	}
	

	@Override
	public void add(Hind newEntry) {
		if(n<pq.length-1){
		pq[++n]=newEntry;
		swim(n);
		}
		else{
			System.out.println("Uh Oh Heap Overflow");
		}
		
	}
	
	public void sink(int k){
		while(2*k<=n){
			int j=2*k;
			if(j<n&& greater(j, j|+1))
				j++;
			if(!greater(k, j))
				break;
			exch(k, j);
			k=j;
		}
	}

	@Override
	public Hind removeMin() {
		Hind min=null;
		if(n>=1){
		min=pq[1];
		exch(1, n--);
		sink(1);
		pq[n+1]=null;
		}
		
		return min;
		
	}

	@Override
	public Hind getMin() {
		if(n>=1)
			return pq[1];
		return null;
	}

	@Override
	public boolean isEmpty() {
		return n==0;
	}

	@Override
	public int getSize() {
		return n;
	}

	@Override
	public void clear() {
		n=0;
		
	}

	@Override
	public String toString() {
		String s="Index\tData\n=============\n";
		for(int i=1; i<=n;i++){
			s+=i+"\t"+pq[i]+"\n";
		}
		return s;
	}
	
	
	


}
