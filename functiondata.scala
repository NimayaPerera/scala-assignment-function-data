object functiondata extends App {

  class rational(x : Int , y : Int)
  {

    def numer  = x;
    def deno  = y;

    def neg = new rational(-numer,deno);
    def add ( r : rational) : rational =
      new rational(numer*r.deno + r.numer*deno , deno*r.deno)

    def sub(r : rational) : rational = add(r.neg);
  //  def neg(r : rational) : rational=
    //  def neg = new rational(-this.numer,this.deno);
    override
    def toString: String = numer + "/" + deno
  }

  val k = new rational(1,3);
  val m = k.neg;
  println(m )

  val x = new rational(3,4)
  val y = new rational(5,8)
  val z = new rational(2,7)

  val ans = x.sub(y).sub(z)
  println(ans)

}
