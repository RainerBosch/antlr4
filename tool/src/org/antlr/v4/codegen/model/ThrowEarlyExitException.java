package org.antlr.v4.codegen.model;

import org.antlr.v4.codegen.CoreOutputModelFactory;
import org.antlr.v4.misc.IntervalSet;
import org.antlr.v4.tool.GrammarAST;

/** */
public class ThrowEarlyExitException extends ThrowRecognitionException {
	public ThrowEarlyExitException(CoreOutputModelFactory factory, GrammarAST ast, IntervalSet expecting) {
		super(factory, ast, expecting);
	}
}