/**
 *
 */
package com.titan.vo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ElementVO {

	// unique id
	protected final String id;
	protected final String type;
	protected Map<String, Object> properties = new HashMap<String, Object>();

	public ElementVO(final String id, final String type) {
		super();
		this.id = id;
		this.type = type;
	}

	/**
	 * @return the properties
	 */
	public Map<String, Object> getProperties() {
		return properties;
	}

	public Set<String> getPropertyKeys() {
		return new HashSet<String>(this.properties.keySet());
	}

	public <T> T getProperty(final String key) {
		return (T) this.properties.get(key);
	}

	/**
	 * @param properties
	 *            the properties to set
	 */
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}

	public void setProperty(final String key, final Object value) {
		this.properties.put(key, value);
	}

	public <T> T removeProperty(final String key) {
		Object oldValue = this.properties.remove(key);
		return (T) oldValue;
	}

	/**
	 *
	 */
	public void cleanProperties() {
		this.properties.clear();
	}

	public int hashCode() {
		return this.id.hashCode();
	}

	public String getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\t ElementVO [id=" + id + ", type=" + type + ", properties=" + properties + "]";
	}

	public String getType() {
		return type;
	}

}
