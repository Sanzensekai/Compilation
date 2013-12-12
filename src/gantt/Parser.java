
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu Dec 12 10:33:33 CET 2013
//----------------------------------------------------

package gantt;

import java.util.TreeMap;
import java.util.Map;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu Dec 12 10:33:33 CET 2013
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\002\000\002\002\004\000\002\002" +
    "\005\000\002\003\005\000\002\003\003\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\004\000\002\004\004\000\002\004\005\000\002" +
    "\004\003\000\002\004\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\016\002\001\005\001\006\001\011\001\014" +
    "\001\015\001\001\002\000\016\002\014\005\007\006\011" +
    "\011\013\014\010\015\005\001\002\000\016\004\033\005" +
    "\ufff4\006\ufff4\007\ufff4\010\ufff4\013\ufff4\001\002\000\004" +
    "\013\032\001\002\000\014\005\007\006\011\011\013\014" +
    "\010\015\015\001\002\000\016\005\ufff5\006\ufff5\007\ufff5" +
    "\010\ufff5\012\ufff5\013\ufff5\001\002\000\014\005\007\006" +
    "\011\011\013\014\010\015\015\001\002\000\014\005\020" +
    "\006\021\007\023\010\022\013\ufffd\001\002\000\014\005" +
    "\007\006\011\011\013\014\010\015\015\001\002\000\004" +
    "\002\000\001\002\000\016\005\ufff4\006\ufff4\007\ufff4\010" +
    "\ufff4\012\ufff4\013\ufff4\001\002\000\014\005\020\006\021" +
    "\007\023\010\022\012\017\001\002\000\016\005\ufff6\006" +
    "\ufff6\007\ufff6\010\ufff6\012\ufff6\013\ufff6\001\002\000\014" +
    "\005\007\006\011\011\013\014\010\015\015\001\002\000" +
    "\014\005\007\006\011\011\013\014\010\015\015\001\002" +
    "\000\014\005\007\006\011\011\013\014\010\015\015\001" +
    "\002\000\014\005\007\006\011\011\013\014\010\015\015" +
    "\001\002\000\016\005\ufffa\006\ufffa\007\ufffa\010\ufffa\012" +
    "\ufffa\013\ufffa\001\002\000\016\005\ufff9\006\ufff9\007\ufff9" +
    "\010\ufff9\012\ufff9\013\ufff9\001\002\000\016\005\ufffb\006" +
    "\ufffb\007\023\010\022\012\ufffb\013\ufffb\001\002\000\016" +
    "\005\ufffc\006\ufffc\007\023\010\022\012\ufffc\013\ufffc\001" +
    "\002\000\016\005\ufff8\006\ufff8\007\ufff8\010\ufff8\012\ufff8" +
    "\013\ufff8\001\002\000\016\005\ufff7\006\ufff7\007\ufff7\010" +
    "\ufff7\012\ufff7\013\ufff7\001\002\000\016\002\uffff\005\uffff" +
    "\006\uffff\011\uffff\014\uffff\015\uffff\001\002\000\014\005" +
    "\007\006\011\011\013\014\010\015\015\001\002\000\014" +
    "\005\020\006\021\007\023\010\022\013\ufffe\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\004\002\003\001\001\000\006\003\005\004" +
    "\011\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\004\030\001\001\000\002\001\001\000\004\004\027\001" +
    "\001\000\002\001\001\000\004\004\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\026\001\001\000\004\004\025\001\001" +
    "\000\004\004\024\001\001\000\004\004\023\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\033\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP_actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP_actions();
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP_do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    
    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
		m.append (info.toString());
        m.append(" : "+message);
        System.err.println(m.toString());
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

	private Map<String, Integer> values = new TreeMap<String, Integer> ();

	public void setValue (String name, int value) {
		values.put(name, new Integer (value));
	}
	
	public int getValue (String name) {
		int value = 0;
		if (values.containsKey(name))
			value = values.get(name).intValue();
		return value;
	}



/** Cup generated class to encapsulate user supplied action code.*/
class CUP_actions {

  /** Constructor */

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP_do_action(
    int                        CUP_act_num,
    java_cup.runtime.lr_parser CUP_parser,
    java.util.Stack            CUP_stack,
    int                        CUP_top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP_result;

      /* select the action based on the action number */
      switch (CUP_act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expr ::= ID 
            {
              Integer RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = getValue(n); 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expr ::= NUMBER 
            {
              Integer RESULT =null;
		Integer n = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = n; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expr ::= LPAREN expr RPAREN 
            {
              Integer RESULT =null;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		 RESULT = e; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expr ::= PLUS expr 
            {
              Integer RESULT =null;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = + e; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expr ::= MINUS expr 
            {
              Integer RESULT =null;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = - e; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // expr ::= expr DIVIDE expr 
            {
              Integer RESULT =null;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = e1 / e2; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // expr ::= expr TIMES expr 
            {
              Integer RESULT =null;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = e1 * e2; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expr ::= expr MINUS expr 
            {
              Integer RESULT =null;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = e1 - e2; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expr ::= expr PLUS expr 
            {
              Integer RESULT =null;
		Integer e1 = (Integer)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Integer e2 = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 RESULT = e1 + e2; 
              CUP_result = getSymbolFactory().newSymbol("expr",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instr ::= expr 
            {
              Object RESULT =null;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 System.out.println (e); 
              CUP_result = getSymbolFactory().newSymbol("instr",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instr ::= ID EQUAL expr 
            {
              Object RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 setValue (n, e); 
              CUP_result = getSymbolFactory().newSymbol("instr",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // list ::= list instr EOLN 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("list",0, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= list EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		RESULT = start_val;
              CUP_result = getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP_parser.done_parsing();
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // list ::= 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("list",0, RESULT);
            }
          return CUP_result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

}