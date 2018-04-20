package com.dev.java.designpatterns.strucural.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ArrayListMap<E> extends ArrayList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8552027631477196645L;

	private Map<Integer, E> map = new HashMap<>();

	private int count = 0;

	@Override
	public boolean add(E e) {

		map.put(incrementCount(), e);
		return true;
	}

	@Override
	public void add(int index, E e) {

		if (index > count)
			throw new IndexOutOfBoundsException(String.format("Given Index %d is more than the List size", index));

		map.put(index, e);
	}

	@Override
	public void clear() {

		map.clear();
		count = 0;
	}

	@Override
	public boolean contains(Object e) {

		boolean output = false;
		Optional<Object> obj = Optional.ofNullable(e);
		if (!obj.isPresent()) {

			output = false;
		} else if (e instanceof ArrayList) {
			Optional<E> arrayListMap = map.entrySet().stream().map(entrySet -> entrySet.getValue())
					.filter(value -> value.equals(e)).findFirst();

			output = arrayListMap.isPresent();
		}
		return output;
	}

	private synchronized int incrementCount() {

		return ++count;

	}

	@Override
	public boolean equals(Object o) {

		if (o == null || !(o instanceof ArrayListMap))
			return false;
		List<E> list = map.entrySet().stream().map(entry -> entry.getValue()).collect(Collectors.toList());

		ArrayListMap<E> check = (ArrayListMap<E>) o;
		return check.containsAll(list);
	}

	@Override
	public int hashCode() {

		int prime = 31;
		return prime = 101 * prime + map.hashCode();
	}

	@Override
	public boolean isEmpty() {

		return count == 0;
	}

	@Override
	public int size() {

		return count;
	}


	private synchronized int decrementCount() {

		return ++count;

	}
}
