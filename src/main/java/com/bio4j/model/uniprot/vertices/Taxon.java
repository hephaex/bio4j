package com.bio4j.model.uniprot.vertices;

import com.bio4j.model.uniprot.UniprotGraph;
import com.bio4j.model.uniprot.edges.OrganismTaxon;
import com.bio4j.model.uniprot.edges.TaxonParent;
import com.bio4j.angulillos.UntypedGraph;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ppareja on 7/29/2014.
 */
public final class Taxon <I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET>
		extends UniprotGraph.UniprotVertex<
		Taxon<I, RV, RVT, RE, RET>,
		UniprotGraph<I, RV, RVT, RE, RET>.TaxonType,
		I, RV, RVT, RE, RET
		> {

	public Taxon(RV vertex, UniprotGraph<I, RV, RVT, RE, RET>.TaxonType type) {
		super(vertex, type);
	}

	@Override
	public Taxon<I, RV, RVT, RE, RET> self() {
		return this;
	}

	// properties
	public String name() {
		return get(type().name);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////

	// relationships

	// organismTaxon
	// ingoing
	public Stream<OrganismTaxon<I, RV, RVT, RE, RET>> organismTaxon_in(){
		return inMany(graph().OrganismTaxon());
	}
	public Stream<Organism<I, RV, RVT, RE, RET>> organismTaxon_inV(){
		return inManyV(graph().OrganismTaxon());
	}

	// taxonParent
	// ingoing
	public Stream<TaxonParent<I, RV, RVT, RE, RET>> taxonParent_in(){
		return inMany(graph().TaxonParent());
	}
	public Stream<Taxon<I, RV, RVT, RE, RET>> taxonParent_inV(){
		return inManyV(graph().TaxonParent());
	}

	// taxonParent
	// outgoing
	public TaxonParent<I, RV, RVT, RE, RET> taxonParent_out(){
		return outOne(graph().TaxonParent());
	}
	public Taxon<I, RV, RVT, RE, RET> taxonParent_outV(){
		return outOneV(graph().TaxonParent());
	}


}
