package org.antlr.v4.codegen.model;

import org.antlr.v4.codegen.CoreOutputModelFactory;
import org.antlr.v4.tool.GrammarAST;

public class ForcedAction extends Action {
	public ForcedAction(CoreOutputModelFactory factory, GrammarAST ast) {
		super(factory, ast);
	}
}