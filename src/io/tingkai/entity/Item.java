package io.tingkai.entity;

public class Item<K, V> {

	private K key;
	private V value;
	
	public Item() { }
	
	public Item(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.key.toString());
		builder.append("-");
		builder.append(this.value.toString());
		return builder.toString();
	}
}
