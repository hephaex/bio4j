
```java
package com.bio4j.model.uniprot.edges;

import com.bio4j.model.uniprot.UniprotGraph;
import com.bio4j.model.uniprot.vertices.Submission;
import com.bio4j.model.uniprot.vertices.Reference;
import com.bio4j.angulillos.UntypedGraph;

/**
 * Created by ppareja on 7/28/2014.
 */
public final class ReferenceSubmission <I extends UntypedGraph<RV, RVT, RE, RET>, RV, RVT, RE, RET>
		extends
		UniprotGraph.UniprotEdge<
				Reference<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ReferenceType,
				ReferenceSubmission<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.ReferenceSubmissionType,
				Submission<I, RV, RVT, RE, RET>, UniprotGraph<I, RV, RVT, RE, RET>.SubmissionType,
				I, RV, RVT, RE, RET
				> {

	public ReferenceSubmission(RE edge, UniprotGraph<I, RV, RVT, RE, RET>.ReferenceSubmissionType type) {

		super(edge, type);
	}

	@Override
	public ReferenceSubmission<I, RV, RVT, RE, RET> self() {
		return this;
	}
}
```


------

### Index

+ src
  + main
    + java
      + com
        + bio4j
          + model
            + uniref
              + vertices
                + [UniRef100Cluster.java][main/java/com/bio4j/model/uniref/vertices/UniRef100Cluster.java]
                + [UniRef90Cluster.java][main/java/com/bio4j/model/uniref/vertices/UniRef90Cluster.java]
                + [UniRef50Cluster.java][main/java/com/bio4j/model/uniref/vertices/UniRef50Cluster.java]
              + [UniRefGraph.java][main/java/com/bio4j/model/uniref/UniRefGraph.java]
              + programs
                + [ImportUniRef.java][main/java/com/bio4j/model/uniref/programs/ImportUniRef.java]
            + uniprot_uniref
              + edges
                + [UniRef100Member.java][main/java/com/bio4j/model/uniprot_uniref/edges/UniRef100Member.java]
                + [UniRef50Member.java][main/java/com/bio4j/model/uniprot_uniref/edges/UniRef50Member.java]
                + [UniRef100Representant.java][main/java/com/bio4j/model/uniprot_uniref/edges/UniRef100Representant.java]
                + [UniRef90Representant.java][main/java/com/bio4j/model/uniprot_uniref/edges/UniRef90Representant.java]
                + [UniRef50Representant.java][main/java/com/bio4j/model/uniprot_uniref/edges/UniRef50Representant.java]
                + [UniRef90Member.java][main/java/com/bio4j/model/uniprot_uniref/edges/UniRef90Member.java]
              + [UniprotUniRefGraph.java][main/java/com/bio4j/model/uniprot_uniref/UniprotUniRefGraph.java]
              + programs
                + [ImportUniprotUniRef.java][main/java/com/bio4j/model/uniprot_uniref/programs/ImportUniprotUniRef.java]
            + uniprot_enzymedb
              + edges
                + [EnzymaticActivity.java][main/java/com/bio4j/model/uniprot_enzymedb/edges/EnzymaticActivity.java]
              + [UniprotEnzymeDBGraph.java][main/java/com/bio4j/model/uniprot_enzymedb/UniprotEnzymeDBGraph.java]
              + programs
                + [ImportUniprotEnzymeDB.java][main/java/com/bio4j/model/uniprot_enzymedb/programs/ImportUniprotEnzymeDB.java]
            + enzymedb
              + [EnzymeDBGraph.java][main/java/com/bio4j/model/enzymedb/EnzymeDBGraph.java]
              + vertices
                + [Enzyme.java][main/java/com/bio4j/model/enzymedb/vertices/Enzyme.java]
              + programs
                + [ImportEnzymeDB.java][main/java/com/bio4j/model/enzymedb/programs/ImportEnzymeDB.java]
            + enums
            + ncbiTaxonomy
              + [NCBITaxonomyGraph.java][main/java/com/bio4j/model/ncbiTaxonomy/NCBITaxonomyGraph.java]
              + edges
                + [NCBITaxonParent.java][main/java/com/bio4j/model/ncbiTaxonomy/edges/NCBITaxonParent.java]
              + vertices
                + [NCBITaxon.java][main/java/com/bio4j/model/ncbiTaxonomy/vertices/NCBITaxon.java]
              + programs
                + [ImportNCBITaxonomy.java][main/java/com/bio4j/model/ncbiTaxonomy/programs/ImportNCBITaxonomy.java]
            + go
              + edges
                + goSlims
                  + [GoSlim.java][main/java/com/bio4j/model/go/edges/goSlims/GoSlim.java]
                  + [PlantSlim.java][main/java/com/bio4j/model/go/edges/goSlims/PlantSlim.java]
                + [PositivelyRegulates.java][main/java/com/bio4j/model/go/edges/PositivelyRegulates.java]
                + [HasPartOf.java][main/java/com/bio4j/model/go/edges/HasPartOf.java]
                + [Regulates.java][main/java/com/bio4j/model/go/edges/Regulates.java]
                + [PartOf.java][main/java/com/bio4j/model/go/edges/PartOf.java]
                + [IsA.java][main/java/com/bio4j/model/go/edges/IsA.java]
                + [NegativelyRegulates.java][main/java/com/bio4j/model/go/edges/NegativelyRegulates.java]
                + [SubOntology.java][main/java/com/bio4j/model/go/edges/SubOntology.java]
              + [GoGraph.java][main/java/com/bio4j/model/go/GoGraph.java]
              + vertices
                + [SubOntologies.java][main/java/com/bio4j/model/go/vertices/SubOntologies.java]
                + [GoTerm.java][main/java/com/bio4j/model/go/vertices/GoTerm.java]
                + [GoSlims.java][main/java/com/bio4j/model/go/vertices/GoSlims.java]
              + programs
                + [ImportGO.java][main/java/com/bio4j/model/go/programs/ImportGO.java]
            + uniprot
              + edges
                + [BookCity.java][main/java/com/bio4j/model/uniprot/edges/BookCity.java]
                + [ProteinReference.java][main/java/com/bio4j/model/uniprot/edges/ProteinReference.java]
                + [ProteinIsoform.java][main/java/com/bio4j/model/uniprot/edges/ProteinIsoform.java]
                + [ProteinFeature.java][main/java/com/bio4j/model/uniprot/edges/ProteinFeature.java]
                + [ProteinKeyword.java][main/java/com/bio4j/model/uniprot/edges/ProteinKeyword.java]
                + [ReferenceThesis.java][main/java/com/bio4j/model/uniprot/edges/ReferenceThesis.java]
                + [ArticlePubmed.java][main/java/com/bio4j/model/uniprot/edges/ArticlePubmed.java]
                + [ReferenceAuthorConsortium.java][main/java/com/bio4j/model/uniprot/edges/ReferenceAuthorConsortium.java]
                + [ProteinDataset.java][main/java/com/bio4j/model/uniprot/edges/ProteinDataset.java]
                + [ReferencePatent.java][main/java/com/bio4j/model/uniprot/edges/ReferencePatent.java]
                + [TaxonParent.java][main/java/com/bio4j/model/uniprot/edges/TaxonParent.java]
                + [ProteinReactomeTerm.java][main/java/com/bio4j/model/uniprot/edges/ProteinReactomeTerm.java]
                + [ProteinDisease.java][main/java/com/bio4j/model/uniprot/edges/ProteinDisease.java]
                + [BookPublisher.java][main/java/com/bio4j/model/uniprot/edges/BookPublisher.java]
                + [InstituteCountry.java][main/java/com/bio4j/model/uniprot/edges/InstituteCountry.java]
                + [ReferenceOnlineArticle.java][main/java/com/bio4j/model/uniprot/edges/ReferenceOnlineArticle.java]
                + [BookEditor.java][main/java/com/bio4j/model/uniprot/edges/BookEditor.java]
                + [ProteinOrganism.java][main/java/com/bio4j/model/uniprot/edges/ProteinOrganism.java]
                + [ReferenceSubmission.java][main/java/com/bio4j/model/uniprot/edges/ReferenceSubmission.java]
                + [ProteinPfam.java][main/java/com/bio4j/model/uniprot/edges/ProteinPfam.java]
                + [ProteinEnsembl.java][main/java/com/bio4j/model/uniprot/edges/ProteinEnsembl.java]
                + [SubcellularLocationParent.java][main/java/com/bio4j/model/uniprot/edges/SubcellularLocationParent.java]
                + [ProteinComment.java][main/java/com/bio4j/model/uniprot/edges/ProteinComment.java]
                + [ArticleJournal.java][main/java/com/bio4j/model/uniprot/edges/ArticleJournal.java]
                + [ProteinPIR.java][main/java/com/bio4j/model/uniprot/edges/ProteinPIR.java]
                + [SubmissionDB.java][main/java/com/bio4j/model/uniprot/edges/SubmissionDB.java]
                + [OnlineArticleOnlineJournal.java][main/java/com/bio4j/model/uniprot/edges/OnlineArticleOnlineJournal.java]
                + [OrganismTaxon.java][main/java/com/bio4j/model/uniprot/edges/OrganismTaxon.java]
                + [ThesisInstitute.java][main/java/com/bio4j/model/uniprot/edges/ThesisInstitute.java]
                + [ProteinUniGene.java][main/java/com/bio4j/model/uniprot/edges/ProteinUniGene.java]
                + [ProteinKegg.java][main/java/com/bio4j/model/uniprot/edges/ProteinKegg.java]
                + [ProteinProteinInteraction.java][main/java/com/bio4j/model/uniprot/edges/ProteinProteinInteraction.java]
                + [ProteinRefSeq.java][main/java/com/bio4j/model/uniprot/edges/ProteinRefSeq.java]
                + [ProteinSubcellularLocation.java][main/java/com/bio4j/model/uniprot/edges/ProteinSubcellularLocation.java]
                + [ReferenceUnpublishedObservation.java][main/java/com/bio4j/model/uniprot/edges/ReferenceUnpublishedObservation.java]
                + [ReferenceBook.java][main/java/com/bio4j/model/uniprot/edges/ReferenceBook.java]
                + [IsoformEventGenerator.java][main/java/com/bio4j/model/uniprot/edges/IsoformEventGenerator.java]
                + [IsoformProteinInteraction.java][main/java/com/bio4j/model/uniprot/edges/IsoformProteinInteraction.java]
                + [ProteinIsoformInteraction.java][main/java/com/bio4j/model/uniprot/edges/ProteinIsoformInteraction.java]
                + [ReferenceArticle.java][main/java/com/bio4j/model/uniprot/edges/ReferenceArticle.java]
                + [ProteinInterpro.java][main/java/com/bio4j/model/uniprot/edges/ProteinInterpro.java]
                + [ProteinEMBL.java][main/java/com/bio4j/model/uniprot/edges/ProteinEMBL.java]
                + [ProteinSequenceCaution.java][main/java/com/bio4j/model/uniprot/edges/ProteinSequenceCaution.java]
                + [ReferenceAuthorPerson.java][main/java/com/bio4j/model/uniprot/edges/ReferenceAuthorPerson.java]
                + [ProteinGeneLocation.java][main/java/com/bio4j/model/uniprot/edges/ProteinGeneLocation.java]
              + vertices
                + [Article.java][main/java/com/bio4j/model/uniprot/vertices/Article.java]
                + [Taxon.java][main/java/com/bio4j/model/uniprot/vertices/Taxon.java]
                + [Publisher.java][main/java/com/bio4j/model/uniprot/vertices/Publisher.java]
                + [Book.java][main/java/com/bio4j/model/uniprot/vertices/Book.java]
                + [OnlineArticle.java][main/java/com/bio4j/model/uniprot/vertices/OnlineArticle.java]
                + [GeneLocation.java][main/java/com/bio4j/model/uniprot/vertices/GeneLocation.java]
                + [Person.java][main/java/com/bio4j/model/uniprot/vertices/Person.java]
                + [SubcellularLocation.java][main/java/com/bio4j/model/uniprot/vertices/SubcellularLocation.java]
                + [FeatureType.java][main/java/com/bio4j/model/uniprot/vertices/FeatureType.java]
                + [PIR.java][main/java/com/bio4j/model/uniprot/vertices/PIR.java]
                + [ReactomeTerm.java][main/java/com/bio4j/model/uniprot/vertices/ReactomeTerm.java]
                + [Thesis.java][main/java/com/bio4j/model/uniprot/vertices/Thesis.java]
                + [Ensembl.java][main/java/com/bio4j/model/uniprot/vertices/Ensembl.java]
                + [Keyword.java][main/java/com/bio4j/model/uniprot/vertices/Keyword.java]
                + [Protein.java][main/java/com/bio4j/model/uniprot/vertices/Protein.java]
                + [Submission.java][main/java/com/bio4j/model/uniprot/vertices/Submission.java]
                + [CommentType.java][main/java/com/bio4j/model/uniprot/vertices/CommentType.java]
                + [Pubmed.java][main/java/com/bio4j/model/uniprot/vertices/Pubmed.java]
                + [Reference.java][main/java/com/bio4j/model/uniprot/vertices/Reference.java]
                + [UniGene.java][main/java/com/bio4j/model/uniprot/vertices/UniGene.java]
                + [SequenceCaution.java][main/java/com/bio4j/model/uniprot/vertices/SequenceCaution.java]
                + [EMBL.java][main/java/com/bio4j/model/uniprot/vertices/EMBL.java]
                + [DB.java][main/java/com/bio4j/model/uniprot/vertices/DB.java]
                + [City.java][main/java/com/bio4j/model/uniprot/vertices/City.java]
                + [AlternativeProduct.java][main/java/com/bio4j/model/uniprot/vertices/AlternativeProduct.java]
                + [Institute.java][main/java/com/bio4j/model/uniprot/vertices/Institute.java]
                + [Isoform.java][main/java/com/bio4j/model/uniprot/vertices/Isoform.java]
                + [RefSeq.java][main/java/com/bio4j/model/uniprot/vertices/RefSeq.java]
                + [Kegg.java][main/java/com/bio4j/model/uniprot/vertices/Kegg.java]
                + [Consortium.java][main/java/com/bio4j/model/uniprot/vertices/Consortium.java]
                + [Pfam.java][main/java/com/bio4j/model/uniprot/vertices/Pfam.java]
                + [Disease.java][main/java/com/bio4j/model/uniprot/vertices/Disease.java]
                + [OnlineJournal.java][main/java/com/bio4j/model/uniprot/vertices/OnlineJournal.java]
                + [Patent.java][main/java/com/bio4j/model/uniprot/vertices/Patent.java]
                + [UnpublishedObservation.java][main/java/com/bio4j/model/uniprot/vertices/UnpublishedObservation.java]
                + [Interpro.java][main/java/com/bio4j/model/uniprot/vertices/Interpro.java]
                + [Organism.java][main/java/com/bio4j/model/uniprot/vertices/Organism.java]
                + [Dataset.java][main/java/com/bio4j/model/uniprot/vertices/Dataset.java]
                + [Journal.java][main/java/com/bio4j/model/uniprot/vertices/Journal.java]
                + [Country.java][main/java/com/bio4j/model/uniprot/vertices/Country.java]
              + [UniprotGraph.java][main/java/com/bio4j/model/uniprot/UniprotGraph.java]
              + programs
                + [ImportIsoformSequences.java][main/java/com/bio4j/model/uniprot/programs/ImportIsoformSequences.java]
                + [ImportProteinInteractions.java][main/java/com/bio4j/model/uniprot/programs/ImportProteinInteractions.java]
                + [ImportUniprot.java][main/java/com/bio4j/model/uniprot/programs/ImportUniprot.java]
            + uniprot_ncbiTaxonomy
              + edges
                + [ProteinNCBITaxon.java][main/java/com/bio4j/model/uniprot_ncbiTaxonomy/edges/ProteinNCBITaxon.java]
              + programs
                + [ImportUniprotNCBITaxonomy.java][main/java/com/bio4j/model/uniprot_ncbiTaxonomy/programs/ImportUniprotNCBITaxonomy.java]
              + [UniprotNCBITaxonomyGraph.java][main/java/com/bio4j/model/uniprot_ncbiTaxonomy/UniprotNCBITaxonomyGraph.java]
            + geninfo
              + vertices
                + [GenInfo.java][main/java/com/bio4j/model/geninfo/vertices/GenInfo.java]
              + [GenInfoGraph.java][main/java/com/bio4j/model/geninfo/GenInfoGraph.java]
            + ncbiTaxonomy_geninfo
              + [NCBITaxonomyGenInfoGraph.java][main/java/com/bio4j/model/ncbiTaxonomy_geninfo/NCBITaxonomyGenInfoGraph.java]
              + edges
                + [GenInfoNCBITaxon.java][main/java/com/bio4j/model/ncbiTaxonomy_geninfo/edges/GenInfoNCBITaxon.java]
              + programs
                + [ImportGenInfoNCBITaxonIndex.java][main/java/com/bio4j/model/ncbiTaxonomy_geninfo/programs/ImportGenInfoNCBITaxonIndex.java]
            + uniprot_go
              + edges
                + [GoAnnotation.java][main/java/com/bio4j/model/uniprot_go/edges/GoAnnotation.java]
              + [UniprotGoGraph.java][main/java/com/bio4j/model/uniprot_go/UniprotGoGraph.java]
              + programs
                + [ImportUniprotGo.java][main/java/com/bio4j/model/uniprot_go/programs/ImportUniprotGo.java]

[main/java/com/bio4j/model/uniref/vertices/UniRef100Cluster.java]: ../../uniref/vertices/UniRef100Cluster.java.md
[main/java/com/bio4j/model/uniref/vertices/UniRef90Cluster.java]: ../../uniref/vertices/UniRef90Cluster.java.md
[main/java/com/bio4j/model/uniref/vertices/UniRef50Cluster.java]: ../../uniref/vertices/UniRef50Cluster.java.md
[main/java/com/bio4j/model/uniref/UniRefGraph.java]: ../../uniref/UniRefGraph.java.md
[main/java/com/bio4j/model/uniref/programs/ImportUniRef.java]: ../../uniref/programs/ImportUniRef.java.md
[main/java/com/bio4j/model/uniprot_uniref/edges/UniRef100Member.java]: ../../uniprot_uniref/edges/UniRef100Member.java.md
[main/java/com/bio4j/model/uniprot_uniref/edges/UniRef50Member.java]: ../../uniprot_uniref/edges/UniRef50Member.java.md
[main/java/com/bio4j/model/uniprot_uniref/edges/UniRef100Representant.java]: ../../uniprot_uniref/edges/UniRef100Representant.java.md
[main/java/com/bio4j/model/uniprot_uniref/edges/UniRef90Representant.java]: ../../uniprot_uniref/edges/UniRef90Representant.java.md
[main/java/com/bio4j/model/uniprot_uniref/edges/UniRef50Representant.java]: ../../uniprot_uniref/edges/UniRef50Representant.java.md
[main/java/com/bio4j/model/uniprot_uniref/edges/UniRef90Member.java]: ../../uniprot_uniref/edges/UniRef90Member.java.md
[main/java/com/bio4j/model/uniprot_uniref/UniprotUniRefGraph.java]: ../../uniprot_uniref/UniprotUniRefGraph.java.md
[main/java/com/bio4j/model/uniprot_uniref/programs/ImportUniprotUniRef.java]: ../../uniprot_uniref/programs/ImportUniprotUniRef.java.md
[main/java/com/bio4j/model/uniprot_enzymedb/edges/EnzymaticActivity.java]: ../../uniprot_enzymedb/edges/EnzymaticActivity.java.md
[main/java/com/bio4j/model/uniprot_enzymedb/UniprotEnzymeDBGraph.java]: ../../uniprot_enzymedb/UniprotEnzymeDBGraph.java.md
[main/java/com/bio4j/model/uniprot_enzymedb/programs/ImportUniprotEnzymeDB.java]: ../../uniprot_enzymedb/programs/ImportUniprotEnzymeDB.java.md
[main/java/com/bio4j/model/enzymedb/EnzymeDBGraph.java]: ../../enzymedb/EnzymeDBGraph.java.md
[main/java/com/bio4j/model/enzymedb/vertices/Enzyme.java]: ../../enzymedb/vertices/Enzyme.java.md
[main/java/com/bio4j/model/enzymedb/programs/ImportEnzymeDB.java]: ../../enzymedb/programs/ImportEnzymeDB.java.md
[main/java/com/bio4j/model/ncbiTaxonomy/NCBITaxonomyGraph.java]: ../../ncbiTaxonomy/NCBITaxonomyGraph.java.md
[main/java/com/bio4j/model/ncbiTaxonomy/edges/NCBITaxonParent.java]: ../../ncbiTaxonomy/edges/NCBITaxonParent.java.md
[main/java/com/bio4j/model/ncbiTaxonomy/vertices/NCBITaxon.java]: ../../ncbiTaxonomy/vertices/NCBITaxon.java.md
[main/java/com/bio4j/model/ncbiTaxonomy/programs/ImportNCBITaxonomy.java]: ../../ncbiTaxonomy/programs/ImportNCBITaxonomy.java.md
[main/java/com/bio4j/model/go/edges/goSlims/GoSlim.java]: ../../go/edges/goSlims/GoSlim.java.md
[main/java/com/bio4j/model/go/edges/goSlims/PlantSlim.java]: ../../go/edges/goSlims/PlantSlim.java.md
[main/java/com/bio4j/model/go/edges/PositivelyRegulates.java]: ../../go/edges/PositivelyRegulates.java.md
[main/java/com/bio4j/model/go/edges/HasPartOf.java]: ../../go/edges/HasPartOf.java.md
[main/java/com/bio4j/model/go/edges/Regulates.java]: ../../go/edges/Regulates.java.md
[main/java/com/bio4j/model/go/edges/PartOf.java]: ../../go/edges/PartOf.java.md
[main/java/com/bio4j/model/go/edges/IsA.java]: ../../go/edges/IsA.java.md
[main/java/com/bio4j/model/go/edges/NegativelyRegulates.java]: ../../go/edges/NegativelyRegulates.java.md
[main/java/com/bio4j/model/go/edges/SubOntology.java]: ../../go/edges/SubOntology.java.md
[main/java/com/bio4j/model/go/GoGraph.java]: ../../go/GoGraph.java.md
[main/java/com/bio4j/model/go/vertices/SubOntologies.java]: ../../go/vertices/SubOntologies.java.md
[main/java/com/bio4j/model/go/vertices/GoTerm.java]: ../../go/vertices/GoTerm.java.md
[main/java/com/bio4j/model/go/vertices/GoSlims.java]: ../../go/vertices/GoSlims.java.md
[main/java/com/bio4j/model/go/programs/ImportGO.java]: ../../go/programs/ImportGO.java.md
[main/java/com/bio4j/model/uniprot/edges/BookCity.java]: BookCity.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinReference.java]: ProteinReference.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinIsoform.java]: ProteinIsoform.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinFeature.java]: ProteinFeature.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinKeyword.java]: ProteinKeyword.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceThesis.java]: ReferenceThesis.java.md
[main/java/com/bio4j/model/uniprot/edges/ArticlePubmed.java]: ArticlePubmed.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceAuthorConsortium.java]: ReferenceAuthorConsortium.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinDataset.java]: ProteinDataset.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferencePatent.java]: ReferencePatent.java.md
[main/java/com/bio4j/model/uniprot/edges/TaxonParent.java]: TaxonParent.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinReactomeTerm.java]: ProteinReactomeTerm.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinDisease.java]: ProteinDisease.java.md
[main/java/com/bio4j/model/uniprot/edges/BookPublisher.java]: BookPublisher.java.md
[main/java/com/bio4j/model/uniprot/edges/InstituteCountry.java]: InstituteCountry.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceOnlineArticle.java]: ReferenceOnlineArticle.java.md
[main/java/com/bio4j/model/uniprot/edges/BookEditor.java]: BookEditor.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinOrganism.java]: ProteinOrganism.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceSubmission.java]: ReferenceSubmission.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinPfam.java]: ProteinPfam.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinEnsembl.java]: ProteinEnsembl.java.md
[main/java/com/bio4j/model/uniprot/edges/SubcellularLocationParent.java]: SubcellularLocationParent.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinComment.java]: ProteinComment.java.md
[main/java/com/bio4j/model/uniprot/edges/ArticleJournal.java]: ArticleJournal.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinPIR.java]: ProteinPIR.java.md
[main/java/com/bio4j/model/uniprot/edges/SubmissionDB.java]: SubmissionDB.java.md
[main/java/com/bio4j/model/uniprot/edges/OnlineArticleOnlineJournal.java]: OnlineArticleOnlineJournal.java.md
[main/java/com/bio4j/model/uniprot/edges/OrganismTaxon.java]: OrganismTaxon.java.md
[main/java/com/bio4j/model/uniprot/edges/ThesisInstitute.java]: ThesisInstitute.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinUniGene.java]: ProteinUniGene.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinKegg.java]: ProteinKegg.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinProteinInteraction.java]: ProteinProteinInteraction.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinRefSeq.java]: ProteinRefSeq.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinSubcellularLocation.java]: ProteinSubcellularLocation.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceUnpublishedObservation.java]: ReferenceUnpublishedObservation.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceBook.java]: ReferenceBook.java.md
[main/java/com/bio4j/model/uniprot/edges/IsoformEventGenerator.java]: IsoformEventGenerator.java.md
[main/java/com/bio4j/model/uniprot/edges/IsoformProteinInteraction.java]: IsoformProteinInteraction.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinIsoformInteraction.java]: ProteinIsoformInteraction.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceArticle.java]: ReferenceArticle.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinInterpro.java]: ProteinInterpro.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinEMBL.java]: ProteinEMBL.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinSequenceCaution.java]: ProteinSequenceCaution.java.md
[main/java/com/bio4j/model/uniprot/edges/ReferenceAuthorPerson.java]: ReferenceAuthorPerson.java.md
[main/java/com/bio4j/model/uniprot/edges/ProteinGeneLocation.java]: ProteinGeneLocation.java.md
[main/java/com/bio4j/model/uniprot/vertices/Article.java]: ../vertices/Article.java.md
[main/java/com/bio4j/model/uniprot/vertices/Taxon.java]: ../vertices/Taxon.java.md
[main/java/com/bio4j/model/uniprot/vertices/Publisher.java]: ../vertices/Publisher.java.md
[main/java/com/bio4j/model/uniprot/vertices/Book.java]: ../vertices/Book.java.md
[main/java/com/bio4j/model/uniprot/vertices/OnlineArticle.java]: ../vertices/OnlineArticle.java.md
[main/java/com/bio4j/model/uniprot/vertices/GeneLocation.java]: ../vertices/GeneLocation.java.md
[main/java/com/bio4j/model/uniprot/vertices/Person.java]: ../vertices/Person.java.md
[main/java/com/bio4j/model/uniprot/vertices/SubcellularLocation.java]: ../vertices/SubcellularLocation.java.md
[main/java/com/bio4j/model/uniprot/vertices/FeatureType.java]: ../vertices/FeatureType.java.md
[main/java/com/bio4j/model/uniprot/vertices/PIR.java]: ../vertices/PIR.java.md
[main/java/com/bio4j/model/uniprot/vertices/ReactomeTerm.java]: ../vertices/ReactomeTerm.java.md
[main/java/com/bio4j/model/uniprot/vertices/Thesis.java]: ../vertices/Thesis.java.md
[main/java/com/bio4j/model/uniprot/vertices/Ensembl.java]: ../vertices/Ensembl.java.md
[main/java/com/bio4j/model/uniprot/vertices/Keyword.java]: ../vertices/Keyword.java.md
[main/java/com/bio4j/model/uniprot/vertices/Protein.java]: ../vertices/Protein.java.md
[main/java/com/bio4j/model/uniprot/vertices/Submission.java]: ../vertices/Submission.java.md
[main/java/com/bio4j/model/uniprot/vertices/CommentType.java]: ../vertices/CommentType.java.md
[main/java/com/bio4j/model/uniprot/vertices/Pubmed.java]: ../vertices/Pubmed.java.md
[main/java/com/bio4j/model/uniprot/vertices/Reference.java]: ../vertices/Reference.java.md
[main/java/com/bio4j/model/uniprot/vertices/UniGene.java]: ../vertices/UniGene.java.md
[main/java/com/bio4j/model/uniprot/vertices/SequenceCaution.java]: ../vertices/SequenceCaution.java.md
[main/java/com/bio4j/model/uniprot/vertices/EMBL.java]: ../vertices/EMBL.java.md
[main/java/com/bio4j/model/uniprot/vertices/DB.java]: ../vertices/DB.java.md
[main/java/com/bio4j/model/uniprot/vertices/City.java]: ../vertices/City.java.md
[main/java/com/bio4j/model/uniprot/vertices/AlternativeProduct.java]: ../vertices/AlternativeProduct.java.md
[main/java/com/bio4j/model/uniprot/vertices/Institute.java]: ../vertices/Institute.java.md
[main/java/com/bio4j/model/uniprot/vertices/Isoform.java]: ../vertices/Isoform.java.md
[main/java/com/bio4j/model/uniprot/vertices/RefSeq.java]: ../vertices/RefSeq.java.md
[main/java/com/bio4j/model/uniprot/vertices/Kegg.java]: ../vertices/Kegg.java.md
[main/java/com/bio4j/model/uniprot/vertices/Consortium.java]: ../vertices/Consortium.java.md
[main/java/com/bio4j/model/uniprot/vertices/Pfam.java]: ../vertices/Pfam.java.md
[main/java/com/bio4j/model/uniprot/vertices/Disease.java]: ../vertices/Disease.java.md
[main/java/com/bio4j/model/uniprot/vertices/OnlineJournal.java]: ../vertices/OnlineJournal.java.md
[main/java/com/bio4j/model/uniprot/vertices/Patent.java]: ../vertices/Patent.java.md
[main/java/com/bio4j/model/uniprot/vertices/UnpublishedObservation.java]: ../vertices/UnpublishedObservation.java.md
[main/java/com/bio4j/model/uniprot/vertices/Interpro.java]: ../vertices/Interpro.java.md
[main/java/com/bio4j/model/uniprot/vertices/Organism.java]: ../vertices/Organism.java.md
[main/java/com/bio4j/model/uniprot/vertices/Dataset.java]: ../vertices/Dataset.java.md
[main/java/com/bio4j/model/uniprot/vertices/Journal.java]: ../vertices/Journal.java.md
[main/java/com/bio4j/model/uniprot/vertices/Country.java]: ../vertices/Country.java.md
[main/java/com/bio4j/model/uniprot/UniprotGraph.java]: ../UniprotGraph.java.md
[main/java/com/bio4j/model/uniprot/programs/ImportIsoformSequences.java]: ../programs/ImportIsoformSequences.java.md
[main/java/com/bio4j/model/uniprot/programs/ImportProteinInteractions.java]: ../programs/ImportProteinInteractions.java.md
[main/java/com/bio4j/model/uniprot/programs/ImportUniprot.java]: ../programs/ImportUniprot.java.md
[main/java/com/bio4j/model/uniprot_ncbiTaxonomy/edges/ProteinNCBITaxon.java]: ../../uniprot_ncbiTaxonomy/edges/ProteinNCBITaxon.java.md
[main/java/com/bio4j/model/uniprot_ncbiTaxonomy/programs/ImportUniprotNCBITaxonomy.java]: ../../uniprot_ncbiTaxonomy/programs/ImportUniprotNCBITaxonomy.java.md
[main/java/com/bio4j/model/uniprot_ncbiTaxonomy/UniprotNCBITaxonomyGraph.java]: ../../uniprot_ncbiTaxonomy/UniprotNCBITaxonomyGraph.java.md
[main/java/com/bio4j/model/geninfo/vertices/GenInfo.java]: ../../geninfo/vertices/GenInfo.java.md
[main/java/com/bio4j/model/geninfo/GenInfoGraph.java]: ../../geninfo/GenInfoGraph.java.md
[main/java/com/bio4j/model/ncbiTaxonomy_geninfo/NCBITaxonomyGenInfoGraph.java]: ../../ncbiTaxonomy_geninfo/NCBITaxonomyGenInfoGraph.java.md
[main/java/com/bio4j/model/ncbiTaxonomy_geninfo/edges/GenInfoNCBITaxon.java]: ../../ncbiTaxonomy_geninfo/edges/GenInfoNCBITaxon.java.md
[main/java/com/bio4j/model/ncbiTaxonomy_geninfo/programs/ImportGenInfoNCBITaxonIndex.java]: ../../ncbiTaxonomy_geninfo/programs/ImportGenInfoNCBITaxonIndex.java.md
[main/java/com/bio4j/model/uniprot_go/edges/GoAnnotation.java]: ../../uniprot_go/edges/GoAnnotation.java.md
[main/java/com/bio4j/model/uniprot_go/UniprotGoGraph.java]: ../../uniprot_go/UniprotGoGraph.java.md
[main/java/com/bio4j/model/uniprot_go/programs/ImportUniprotGo.java]: ../../uniprot_go/programs/ImportUniprotGo.java.md