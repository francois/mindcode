package info.teksol.mindcode.ast;

import java.util.List;
import java.util.Objects;

public class CaseExpression implements AstNode {
    private final AstNode condition;
    private final List<CaseAlternative> alternatives;
    private final AstNode elseBranch;

    CaseExpression(AstNode condition, List<CaseAlternative> alternatives, AstNode elseBranch) {
        this.condition = condition;
        this.alternatives = alternatives;
        this.elseBranch = elseBranch;
    }

    public AstNode getCondition() {
        return condition;
    }

    public List<CaseAlternative> getAlternatives() {
        return alternatives;
    }

    public AstNode getElseBranch() {
        return elseBranch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaseExpression that = (CaseExpression) o;
        return Objects.equals(condition, that.condition) &&
                Objects.equals(alternatives, that.alternatives) &&
                Objects.equals(elseBranch, that.elseBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, alternatives, elseBranch);
    }

    @Override
    public String toString() {
        return "CaseExpression{" +
                "condition=" + condition +
                ", alternatives=" + alternatives +
                ", elseBranch=" + elseBranch +
                '}';
    }
}
