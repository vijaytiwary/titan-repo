package com.titan.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class VertexVO extends ElementVO {

	/**
	 *
	 */
	protected Map<String, Set<EdgeVO>> outEdges = new HashMap<String, Set<EdgeVO>>();
	/**
     *
     */
	protected Map<String, Set<EdgeVO>> inEdges = new HashMap<String, Set<EdgeVO>>();

	/**
	 * @param id
	 * @param graph
	 */
	public VertexVO(final String id, final String type) {
		super(id, type);
	}

	/**
	 * @return the outEdges
	 */
	public Map<String, Set<EdgeVO>> getOutEdges() {
		return outEdges;
	}

	/**
	 * @return the inEdges
	 */
	public Map<String, Set<EdgeVO>> getInEdges() {
		return inEdges;
	}

	/**
	 * @param direction
	 * @param labels
	 * @return
	 */
	public List<EdgeVO> getEdges(final String direction, final String... labels) {
		final List<EdgeVO> totalEdges = new ArrayList<EdgeVO>();
		if (direction.equals("OUT")) {
			totalEdges.addAll(this.getOutEdges(labels));
		} else if (direction.equals("IN"))
			totalEdges.addAll(this.getInEdges(labels));
		else {
			totalEdges.addAll(this.getOutEdges(labels));
			totalEdges.addAll(this.getInEdges(labels));
		}
		return totalEdges;
	}

	/**
	 * @param labels
	 * @return
	 */
	public List<EdgeVO> getInEdges(final String... labels) {
		final List<EdgeVO> totalEdges = new ArrayList<EdgeVO>();
		if (labels.length == 0) {
			for (final Collection<EdgeVO> edges : this.inEdges.values()) {
				totalEdges.addAll(edges);
			}
		} else {
			for (final String label : labels) {
				final Set<EdgeVO> edges = this.inEdges.get(label);
				if (null != edges) {
					totalEdges.addAll(edges);
				}
			}
		}
		return totalEdges;
	}

	/**
	 * @param labels
	 * @return
	 */
	public List<EdgeVO> getOutEdges(final String... labels) {
		final List<EdgeVO> totalEdges = new ArrayList<EdgeVO>();
		if (labels.length == 0) {
			for (final Collection<EdgeVO> edges : this.outEdges.values()) {
				totalEdges.addAll(edges);
			}
		} else {
			for (final String label : labels) {
				final Set<EdgeVO> edges = this.outEdges.get(label);
				if (null != edges) {
					totalEdges.addAll(edges);
				}
			}
		}
		return totalEdges;
	}

	/**
	 * @param label
	 * @param edge
	 */
	public void addOutEdge(final String label, final EdgeVO edge) {
		Set<EdgeVO> edges = this.outEdges.get(label);
		if (null == edges) {
			edges = new HashSet<EdgeVO>();
			this.outEdges.put(label, edges);
		}
		edges.add(edge);
	}

	/**
	 * @param label
	 * @param edge
	 */
	public void addInEdge(final String label, final EdgeVO edge) {
		Set<EdgeVO> edges = this.inEdges.get(label);
		if (null == edges) {
			edges = new HashSet<EdgeVO>();
			this.inEdges.put(label, edges);
		}
		edges.add(edge);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n VertexVO [" + this.type + "\t outEdges=" + outEdges.size() + "::" + outEdges + ", inEdges="
				+ inEdges.size() + "::" + inEdges + " \n " + super.toString() + "]";
	}
}
