package com.bio4j.model.relationships.citation.onarticle;

import com.bio4j.model.Relationship;
import com.bio4j.model.RelationshipType;

import com.bio4j.model.uniprot.nodes.OnlineArticle;
import com.bio4j.model.uniprot.nodes.Protein;

/**
 *
 * @author Pablo Pareja <ppareja@era7.com>
 */
public interface OnlineArticleProteinCitation extends Relationship <
    OnlineArticle, OnlineArticle.type,
    OnlineArticleProteinCitation, OnlineArticleProteinCitation.type,
    Protein, Protein.type
> {

    enum type implements RelationshipType <
        OnlineArticle, OnlineArticle.type,
        OnlineArticleProteinCitation, OnlineArticleProteinCitation.type,
        Protein, Protein.type
    > {
        onlineArticleProteinCitation;
        public type value() { return onlineArticleProteinCitation; }
        public arity arity() { return arity.manyToMany; }
    }

}
