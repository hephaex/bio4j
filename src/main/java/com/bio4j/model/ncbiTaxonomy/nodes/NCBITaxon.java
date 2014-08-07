package com.bio4j.model.ncbiTaxonomy.nodes;

import com.bio4j.model.ncbiTaxonomy.NCBITaxonomyGraph;
import com.bio4j.model.ncbiTaxonomy.relationships.NCBITaxonParent;
import com.ohnosequences.typedGraphs.UntypedGraph;

import java.util.List;

public final class NCBITaxon<I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET>
		extends NCBITaxonomyGraph.NCBITaxonomyVertex<
		NCBITaxon<I, RV, RVT, RE, RET>,
		NCBITaxonomyGraph<I, RV, RVT, RE, RET>.NCBITaxonType,
		I, RV, RVT, RE, RET
		> {

	public NCBITaxon(RV vertex, NCBITaxonomyGraph<I, RV, RVT, RE, RET>.NCBITaxonType type) {
		super(vertex, type);
	}

	@Override
	public NCBITaxon<I, RV, RVT, RE, RET> self() {
		return this;
	}

	// properties
	public String id() {
		return get(type().id);
	}

	public String name() {
		return get(type().name);
	}

	public String comment() {
		return get(type().comment);
	}

	public String scientificName() {
		return get(type().scientificName);
	}

	public Integer taxonomicRank() {
		return get(type().taxonomicRank);
	}

	//----ncbiTaxonParent-------
	// ingoing
	public List<NCBITaxonParent<I, RV, RVT, RE, RET>> ncbiTaxonParent_in(){
		return inMany(graph().NCBITaxonParent());
	}
	public List<NCBITaxon<I, RV, RVT, RE, RET>> ncbiTaxonParent_inV(){
		return inManyV(graph().NCBITaxonParent());
	}

	//----ncbiTaxonParent-------
	// outgoing
	public NCBITaxonParent<I, RV, RVT, RE, RET> ncbiTaxonParent_out(){
		return outOne(graph().NCBITaxonParent());
	}
	public NCBITaxon<I, RV, RVT, RE, RET> ncbiTaxonParent_outV(){
		return outOneV(graph().NCBITaxonParent());
	}

}