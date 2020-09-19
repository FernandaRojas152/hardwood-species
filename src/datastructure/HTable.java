package datastructure;

public class HTable<K,T> implements IHashTable<K, T> {
	/** */
	private final static int SIZE=10000;
	
	/** */
	private HashElement<K, T>[] map;
	
	/** */
	private K[] key;
	
	/** */
	int occupied;
	
	//Methods
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public HTable() {
		map= new HashElement[SIZE];
		key= (K[]) new Object[SIZE];
		occupied= 1;
	}
	
	/**
	 * 
	 */
	@Override
	public int getSlot(K key) {
		//Math.floor(SIZE); funcion piso
		//Math.ceil(SIZE); funcion techo
		int ha= key.hashCode() % SIZE;
		if(ha<0) {
			ha= ha*-1;
		}
		return ha;
	}
	
	/**
	 * 
	 */
	@Override
	public void insert(K key, T element) {
		int hashIndex= getSlot(key);
		HashElement<K, T> newElement = new HashElement<K, T>(key, element);
		int i=hashIndex;
		int h=0;
		do {
			if(this.key[i]==null) {
				this.key[i]= key;
				map[i]= newElement;
				occupied++;
			}
			if(this.key[i]== key) {
				map[i]= newElement;
			}
			i= (i+h*h++)% SIZE;
		}while(i!= hashIndex);
	}
	
	/**
	 * 
	 */
	@Override
	public void delete(K key) {
		int hashIndex= getSlot(key);
		int h=1;
		
		if(!contains(key)) {
			return ;
		}
		
		while(key!= this.key[hashIndex]) {
			hashIndex= (hashIndex+h*h++)% SIZE;
		}
		
		this.key[hashIndex]= null;
		map[hashIndex]= null;
		
		for (int i = hashIndex; i < this.key.length; i++) {
			
		}
	}
	
	/**
	 * 
	 */
	@Override
	public HashElement<K, T> search(K key) {
		int hashIndex= getSlot(key);
		int h=1;
		HashElement<K, T> aux= null;
		while(this.key[hashIndex]!=null) {
			if(this.key[hashIndex] == key){
				aux= map[hashIndex];
				hashIndex= (hashIndex+h*h++) % SIZE;
			}
		}
		return aux;
	}
	
	public int amountTimes(K key) {
		return 0;
	}
	
	/**
	 * 
	 */
	@Override
	public boolean isEmpty() {
		return occupied==0;
	}
	
	/**
	 * 
	 */
	@Override
	public int size() {
		return SIZE;
	}
	
	@Override
	public boolean contains(K key) {
		return search(key)!=null;
	}
}
