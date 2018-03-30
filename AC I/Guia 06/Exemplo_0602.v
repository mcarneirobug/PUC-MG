//------------------------------------
// Exemplo_0602 - GATES  	     |
// Nome: Matheus Santos Rosa Carneiro|
// Matricula: 613414                 |
//------------------------------------

//--------------------
// or_gate	     |
//--------------------

module or_gate( output s, 
                input  a,
                input  b);

//descrever por portas
or U1(s, a, b);

endmodule //or_gate

//--------------------
// and_gate	     |
//--------------------

module and_gate( output s, 
		 input  a,
		 input  b);

//descrever por portas
and U1(s, a, b);

endmodule //and_gate

//-------------
// multiplexer|
//-------------

module mux ( output s,
	     input  a,
	     input  b,
	     input select );

//definir dados locais
wire notselect;
wire sa;
wire sb;

//descrever por portas 
not U1(notselect, select);

and U2(sa, a, notselect);
and U3(sb, b, select);

or  U4(s, sa, sb);

endmodule//mux

module Exemplo_0602;
//------------------- definir dados
reg x;
reg y;
reg s;
wire w;
wire z;
wire out;
//---------------------- chamada module
 
and_gate moduloAnd(w, x, y);
or_gate  moduloOr(z, x, y);
mux moduloMux(out, w, z, s);

//---------------------- parte principal 
initial 
begin : main 
    $display("Exemplo_0602 - Matheus Santos Rosa Carneiro - 613414");
    $display("Test Lu's module");
    $display("   x    y    s    out ");
    $monitor("%4b %4b %4b %4b", x, y, s, out);

    //projetar testes do modulo
    x = 1'b0; y = 1'b0; s = 1'b0;
#1  x = 1'b0; y = 1'b0; s = 1'b1;
#1  x = 1'b0; y = 1'b1; s = 1'b0;
#1  x = 1'b0; y = 1'b1; s = 1'b1;
#1  x = 1'b1; y = 1'b0; s = 1'b0;
#1  x = 1'b1; y = 1'b0; s = 1'b1;
#1  x = 1'b1; y = 1'b1; s = 1'b0;
#1  x = 1'b1; y = 1'b1; s = 1'b1;

    end 
endmodule//Exemplo_0602  
