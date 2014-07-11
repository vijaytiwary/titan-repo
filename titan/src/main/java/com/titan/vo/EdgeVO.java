/**
 *
 */
package com.titan.vo;


public class EdgeVO extends ElementVO {

	/**
	 *
	 */
	private final String label;
	/**
	 *
	 */
	private final VertexVO inVertex;
	/**
	 *
	 */
	private final VertexVO outVertex;

	/**
	 * @param id
	 * @param outVertex
	 * @param inVertex
	 * @param label
	 * @param graph
	 */
	public EdgeVO(final String id, final String type, final VertexVO outVertex, final VertexVO inVertex,
			final String label) {
		super(id, type);
		this.label = label;
		this.outVertex = outVertex;
		this.inVertex = inVertex;
	}

	/**
	 * @return
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * @param direction
	 * @return
	 * @throws IllegalArgumentException
	 */
	public VertexVO getVertex(final String direction) throws IllegalArgumentException {
		if (direction.equals("IN")) {
			return this.inVertex;
		} else if (direction.equals("OUT")) {
			return this.outVertex;
		} else {
			return null;
		}
	}

	/**
	 * @return the inVertex
	 */
	public VertexVO getInVertex() {
		return this.inVertex;
	}

	/**
	 * @return the outVertex
	 */
	public VertexVO getOutVertex() {
		return this.outVertex;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\n EdgeVO [" + this.type + "\t label=" + label + ", \n inVertex=" + inVertex.type + ", \n outVertex="
				+ outVertex.type + "\n " + super.toString() + "]";
	}
}
