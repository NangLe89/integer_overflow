package utility;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/** This class knows about the representation chosen for sets. */
public class SetRepUtility {

		/** Return a new singleton set. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set singleton(Object o) { 
			HashSet h = new HashSet();
			h.add(o);
			return h; 
		}
		
		/** Return a new empty set */
		@SuppressWarnings("rawtypes")
		public static Set emptySet() { return new HashSet(); }
		
		/** Form the set of Map.Entry pairs that is the cross product of the given key with the set of values. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set<Map.Entry> crossWith(Object key, Set vals) {
			Set<Map.Entry> ret = SetRepUtility.emptySet();
			Iterator i = vals.iterator();
		    while (i.hasNext()) {
			   ret.add(new Pair(key, i.next()));
			}
		    return ret;
		}
		
		/** Form the set of Map.Entry pairs that is the cross product of keys with the given value. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set<Map.Entry> crossWith(Set keys, Object val) {
			Set<Map.Entry> ret = SetRepUtility.emptySet();
			Iterator i = keys.iterator();
		    while (i.hasNext()) {
			   ret.add(new Pair(i.next(), val));
			}
		    return ret;
		}
		
		/** Form the set of Map.Entry pairs that is the cross product of keys and vals. */
		@SuppressWarnings({ "rawtypes", "unchecked" })
		public static Set<Map.Entry> cross(Set keys, Set vals) {
			Set<Map.Entry> ret = SetRepUtility.emptySet();
			Iterator i = keys.iterator();
		    while (i.hasNext()) {
			   ret.addAll(SetRepUtility.crossWith(i.next(), vals));
			}
		    return ret;
		}
		
}
