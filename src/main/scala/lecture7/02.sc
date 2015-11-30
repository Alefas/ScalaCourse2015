"It's new in Scala?"

"No!"

//C/C++
"Macro preprocessor"

//Clojure
"""
(defmacro for-loop [[sym init check change :as params] & steps]
  (cond
    (not (vector? params))
      (throw (Error. "Binding form must be a vector for for-loop"))
    (not= 4 (count params))
      (throw (Error. "Binding form must have exactly 4 arguments in for-loop"))
    :default
      `(loop [~sym ~init value# nil]
         (if ~check
           (let [new-value# (do ~@steps)]
             (recur ~change new-value#))
           value#))))
"""

//Nemerle
"""
macro AddClassInsideNamespace(namespaceName : PExpr)
{
  def typer = Macros.ImplicitCTX();

  match (Util.QidOfExpr(namespaceName))
  {
  | Some((qualifiedIdentifier, _)) =>
      def env = typer.Manager.CoreEnv.EnterIntoNamespace(qualifiedIdentifier);
      def builder = env.Define(<[ decl:
          public class MyType
          {
            public Test() : void {  }
          } ]>);

      builder.Compile();

  | None => Message.FatalError(namespaceName.Location,
                "expected qualified identifier");
  }
}
"""