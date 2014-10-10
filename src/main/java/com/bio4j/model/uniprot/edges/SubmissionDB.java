package com.bio4j.model.uniprot.edges;

import com.bio4j.model.uniprot.UniprotGraph;
import com.bio4j.model.uniprot.vertices.DB;
import com.bio4j.model.uniprot.vertices.Submission;
import com.bio4j.angulillos.UntypedGraph;

/**
 * Created by ppareja on 7/28/2014.
 */
public final class SubmissionDB <I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET>
		extends
		UniprotGraph.UniprotEdge<
				Submission<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.SubmissionType,
				SubmissionDB<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.SubmissionDBType,
				DB<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.DBType,
				I, RV, RVT, RE, RET
				> {

	public SubmissionDB(RE edge, UniprotGraph<I, RV, RVT, RE, RET>.SubmissionDBType type) {

		super(edge, type);
	}

	@Override
	public SubmissionDB<I, RV, RVT, RE, RET> self() {
		return this;
	}
}