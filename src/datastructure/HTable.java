package datastructure;

public class HTable<K,T> implements IHashTable<K, T> {
	/** */
	private final static int SIZE=1000000;
	
	/** */
	private HashElement<K, T>[] map;
	
	/** */
	int key;
	
	@Override
	public void insert(K key, T element) {
		// TODO Auto-generated method stub
		
		map= new HashElement[SIZE];
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
	public boolean contains() {
		// TODO Auto-generated method stub
		return false;
	}

}
