package datastructure;
/**
 * @version September 15th 2020
 * @author Fernanda A00352189
 * @param <K> the key of the hash table
 * @param <T> the element added to the hash table in its respective key
 */
public interface IHashTable<K,T> {
	//Methods
	public void insert(K key, T element);
	public void delete(K key);
	public HashElement<K, T> search(K key);
	public boolean isEmpty();
	public int size();
	public boolean contains(K key);
	public int getSlot(K key);
}
