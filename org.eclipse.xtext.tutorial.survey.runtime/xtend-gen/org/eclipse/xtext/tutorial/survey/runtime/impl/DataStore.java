package org.eclipse.xtext.tutorial.survey.runtime.impl;

import com.google.common.base.Objects;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.tutorial.survey.runtime.IFormState;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class DataStore {
  private final ArrayList<Multimap<String,String>> storage = new Function0<ArrayList<Multimap<String,String>>>() {
    public ArrayList<Multimap<String,String>> apply() {
      ArrayList<Multimap<String,String>> _newArrayList = CollectionLiterals.<Multimap<String,String>>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public boolean store(final IFormState state) {
    boolean _xblockexpression = false;
    {
      final HashMultimap<String,String> map = HashMultimap.<String, String>create();
      List<String> _fields = state.getFields();
      for (final String field : _fields) {
        {
          final Object value = state.getValue(field);
          if ((value instanceof List<?>)) {
            map.putAll(field, ((List<String>) value));
          } else {
            boolean _and = false;
            boolean _notEquals = (!Objects.equal(value, null));
            if (!_notEquals) {
              _and = false;
            } else {
              String _string = value.toString();
              boolean _isEmpty = _string.isEmpty();
              boolean _not = (!_isEmpty);
              _and = (_notEquals && _not);
            }
            if (_and) {
              String _string_1 = value.toString();
              map.put(field, _string_1);
            }
          }
        }
      }
      boolean _add = this.storage.add(map);
      _xblockexpression = (_add);
    }
    return _xblockexpression;
  }
  
  public LinkedHashSet<String> getKeys() {
    final Function1<Multimap<String,String>,Set<String>> _function = new Function1<Multimap<String,String>,Set<String>>() {
        public Set<String> apply(final Multimap<String,String> it) {
          Set<String> _keySet = it.keySet();
          return _keySet;
        }
      };
    List<Set<String>> _map = ListExtensions.<Multimap<String,String>, Set<String>>map(this.storage, _function);
    Iterable<String> _flatten = Iterables.<String>concat(_map);
    LinkedHashSet<String> _newLinkedHashSet = Sets.<String>newLinkedHashSet(_flatten);
    return _newLinkedHashSet;
  }
  
  public HashMap<String,Integer> getValueCounts(final String key) {
    HashMap<String,Integer> _xblockexpression = null;
    {
      final Function1<Multimap<String,String>,Collection<String>> _function = new Function1<Multimap<String,String>,Collection<String>>() {
          public Collection<String> apply(final Multimap<String,String> it) {
            Collection<String> _get = it.get(key);
            return _get;
          }
        };
      List<Collection<String>> _map = ListExtensions.<Multimap<String,String>, Collection<String>>map(this.storage, _function);
      final Iterable<String> allValues = Iterables.<String>concat(_map);
      final HashMap<String,Integer> result = CollectionLiterals.<String, Integer>newHashMap();
      Set<String> _set = IterableExtensions.<String>toSet(allValues);
      for (final String value : _set) {
        final Function1<String,Boolean> _function_1 = new Function1<String,Boolean>() {
            public Boolean apply(final String it) {
              boolean _equals = Objects.equal(it, value);
              return Boolean.valueOf(_equals);
            }
          };
        Iterable<String> _filter = IterableExtensions.<String>filter(allValues, _function_1);
        int _size = IterableExtensions.size(_filter);
        result.put(value, Integer.valueOf(_size));
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public int getEntryCount() {
    int _size = this.storage.size();
    return _size;
  }
}
