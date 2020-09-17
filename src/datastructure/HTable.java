package datastructure;

public class HTable<K,T> implements IHashTable<K, T> {
	/** */
	private final static int SIZE=10000;
	
	/** */
	private HashElement<K, T>[] map;
	
	/** */
	int key[];
	int occupied;
	
	public HTable() {
		map= new HashElement[SIZE];
	}
	
	@Override
	public int getSlot(K key) {
		//Math.floor(SIZE);
		//Math.ceil(SIZE);
		return key.hashCode() % SIZE;
	}
	
	@Override
	public void insert(K key, T element) {
		int hashIndex= getSlot(key);
		HashElement<K, T> newElement = new HashElement<K, T>(key, element);		
		
	}

	@Override
	public void delete(K key, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IHashTable<K, T> search(K key, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return SIZE;
	}
	
	@Override
	public boolean contains(K key) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
