package datastructure;
/** 
 * @version September 17th 2020
 * @author Fernanda
 * @param <K>
 * @param <T>
 * Class HashElement
 */
public class HashElement<K,T> {
	/** */
	private K key;
	/** */
	private T element;
	/** */
	private HashElement<K, T> prev;
	/** */
	private HashElement<K, T> next;
	
	//Methods
	/**
	 * 
	 * @param key
	 * @param element
	 */
	public HashElement(K key, T element) {
		this.key= key;
		this.element= element;
		prev=null;
		next= null;
	}
	
	/**
	 * 
	 * @return
	 */
	public K getKey() {
		return key;
	}
	
	/**
	 * 
	 * @param key
	 */
	public void setKey(K key) {
		this.key = key;
	}
	
	/**
	 * 
	 * @return
	 */
	public T getElement() {
		return element;
	}
	
	/**
	 * 
	 * @param element
	 */
	public void setElement(T element) {
		this.element = element;
	}

	/**
	 * 
	 * @return
	 */
	public HashElement<K, T> getNext() {
		return next;
	}

	/**
	 * 
	 * @param next
	 */
	public void setNext(HashElement<K, T> next) {
		this.next = next;
	}
	
	/**
	 * 
	 * @return
	 */
	public HashElement<K, T> getPrev() {
		return prev;
	}
	
	/**
	 * 
	 * @param prev
	 */
	public void setPrev(HashElement<K, T> prev) {
		this.prev = prev;
	}
}
