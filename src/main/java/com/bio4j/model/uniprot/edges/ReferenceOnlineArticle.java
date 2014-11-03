package com.bio4j.model.uniprot.edges;

import com.bio4j.model.uniprot.UniprotGraph;
import com.bio4j.model.uniprot.vertices.OnlineArticle;
import com.bio4j.model.uniprot.vertices.Reference;
import com.bio4j.angulillos.UntypedGraph;

/**
 * Created by ppareja on 7/28/2014.
 */
public final class ReferenceOnlineArticle <I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET>
		extends
		UniprotGraph.UniprotEdge<
				Reference<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ReferenceType,
				ReferenceOnlineArticle<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ReferenceOnlineArticleType,
				OnlineArticle<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.OnlineArticleType,
				I, RV, RVT, RE, RET
				> {

	public ReferenceOnlineArticle(RE edge, UniprotGraph<I, RV, RVT, RE, RET>.ReferenceOnlineArticleType type) {

		super(edge, type);
	}

	@Override
	public ReferenceOnlineArticle<I, RV, RVT, RE, RET> self() {
		return this;
	}
}