package main.java;

import java.util.HashSet;
import java.util.Set;

public class Build_in {
	public static final Set<String> name = new HashSet<String>();
	public static final Set<Character> notNameSymbol = new HashSet<Character>();
    public static final Set<String> keepKeywords = new HashSet<String>();
    public static final char[] varCharArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '$', '_', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public static final int firstChar = 54;
    public static final int notFirstChar = 64;
    static {
        name.add("console");
        name.add("log");
        name.add("concat");
        name.add("slice");
        name.add("map");
        name.add("reduce");
        name.add("filter");
        name.add("constructor");
        name.add("toExponential");
        name.add("toFixed");
        name.add("toLocaleString");
        name.add("toPrecision");
        name.add("toString");
        name.add("valueOf");
        name.add("toSource");
        name.add("charAt");
        name.add("charCodeAt");
        name.add("indexOf");
        name.add("lastIndexOf");
        name.add("localeCompare");
        name.add("length");
        name.add("match");
        name.add("replace");
        name.add("search");
        name.add("substr");
        name.add("substring");
        name.add("toLocaleLowerCase");
        name.add("toLocaleUpperCase");
        name.add("toLowerCase");
        name.add("toUpperCase");

        notNameSymbol.add('+');
        notNameSymbol.add('-');
        notNameSymbol.add('*');
        notNameSymbol.add('/');
        notNameSymbol.add('?');
        notNameSymbol.add(',');
        notNameSymbol.add(':');
        notNameSymbol.add(';');
        notNameSymbol.add('=');
        notNameSymbol.add('>');
        notNameSymbol.add('<');
        notNameSymbol.add('!');
        notNameSymbol.add('(');
        notNameSymbol.add(')');
        notNameSymbol.add('{');
        notNameSymbol.add('}');
        notNameSymbol.add('&');
        notNameSymbol.add('|');

        keepKeywords.add("abstract");
        keepKeywords.add("arguments");
        keepKeywords.add("boolean");
        keepKeywords.add("break");
        keepKeywords.add("byte");
        keepKeywords.add("case");
        keepKeywords.add("catch");
        keepKeywords.add("char");
        keepKeywords.add("class");
        keepKeywords.add("const");
        keepKeywords.add("continue");
        keepKeywords.add("debugger");
        keepKeywords.add("default");
        keepKeywords.add("delete");
        keepKeywords.add("do");
        keepKeywords.add("double");
        keepKeywords.add("else");
        keepKeywords.add("enum");
        keepKeywords.add("eval");
        keepKeywords.add("export");
        keepKeywords.add("extends");
        keepKeywords.add("false");
        keepKeywords.add("final");
        keepKeywords.add("finally");
        keepKeywords.add("float");
        keepKeywords.add("for");
        keepKeywords.add("function");
        keepKeywords.add("goto");
        keepKeywords.add("if");
        keepKeywords.add("implements");
        keepKeywords.add("import");
        keepKeywords.add("in");
        keepKeywords.add("instanceof");
        keepKeywords.add("int");
        keepKeywords.add("interface");
        keepKeywords.add("let");
        keepKeywords.add("long");
        keepKeywords.add("native");
        keepKeywords.add("new");
        keepKeywords.add("null");
        keepKeywords.add("package");
        keepKeywords.add("private");
        keepKeywords.add("protected");
        keepKeywords.add("public");
        keepKeywords.add("return");
        keepKeywords.add("short");
        keepKeywords.add("static");
        keepKeywords.add("super");
        keepKeywords.add("switch");
        keepKeywords.add("synchronized");
        keepKeywords.add("this");
        keepKeywords.add("is");
        keepKeywords.add("throw");
        keepKeywords.add("throws");
        keepKeywords.add("transient");
        keepKeywords.add("true");
        keepKeywords.add("try");
        keepKeywords.add("typeof");
        keepKeywords.add("var");
        keepKeywords.add("void");
        keepKeywords.add("volatile");
        keepKeywords.add("while");
        keepKeywords.add("with");
        keepKeywords.add("yield");
    }
}
