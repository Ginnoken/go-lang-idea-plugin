// This is a generated file. Not intended for manual editing.
package com.goide.gotemplate.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.goide.gotemplate.GoTemplateTypes.*;
import com.goide.gotemplate.psi.*;

public class GoTemplateWithStatementImpl extends GoTemplateStatementImpl implements GoTemplateWithStatement {

  public GoTemplateWithStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoTemplateVisitor) ((GoTemplateVisitor)visitor).visitWithStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GoTemplatePipeline getPipeline() {
    return findChildByClass(GoTemplatePipeline.class);
  }

  @Override
  @Nullable
  public GoTemplateStatement getStatement() {
    return findChildByClass(GoTemplateStatement.class);
  }

  @Override
  @Nullable
  public GoTemplateStatementList getStatementList() {
    return findChildByClass(GoTemplateStatementList.class);
  }

}
