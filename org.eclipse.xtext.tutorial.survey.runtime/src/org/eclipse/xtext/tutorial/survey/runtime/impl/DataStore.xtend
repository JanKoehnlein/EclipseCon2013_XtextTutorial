package org.eclipse.xtext.tutorial.survey.runtime.impl

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.common.collect.Sets
import java.util.List
import org.eclipse.xtext.tutorial.survey.runtime.IFormState

class DataStore {
	
	val storage = <Multimap<String, String>>newArrayList()
	
	def store(IFormState state) {
		val map = HashMultimap.create
		for(field: state.fields) {
			val value = state.getValue(field)
			if(value instanceof List<?>)
				map.putAll(field, value as List<String>)
			else if(value != null && !value.toString.empty)
				map.put(field, value.toString)
		}
		storage.add(map)
	}
	
	def getKeys() {
		Sets.newLinkedHashSet(storage.map[keySet].flatten)
	}
	
	def getValueCounts(String key) {
		val allValues = storage.map[get(key)].flatten
		val result = newHashMap
		for(value: allValues.toSet) {
			result.put(value, allValues.filter[it==value].size)
		}
		result
	}
	
	def getEntryCount() {
		storage.size
	}
}