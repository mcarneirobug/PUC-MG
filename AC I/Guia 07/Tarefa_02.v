//-------------------------------------
// Guia 07 - Exemplo_02		      |
// Nome: Matheus Santos Rosa Carneiro |
// Matricula: 613414		      |
//-------------------------------------

module tabela ( output a, 
		output b,
		output c,
		output d,
		output e,
		input  x,
		input  y,
		input  z);

//descrever por expressao
assign a = (x|y|~z) & (x|~y|~z) & (~x|~y|~z);
assign b = (x|~y|~z) & (~x|~y|~z) & (~x|y|~z);
assign c = (x|y|~z) & (x|~y|z) & (x|~y|~z) & (~x|y|~z);
assign d = (x|y|z) & (x|~y|z) & (x|~y|~z) & (~x|~y|~z);
assign e = (x|~y|z) & (x|~y|~z) & (~x|y|~z) & (~x|~y|~z);

endmodule//tabela

module simplificado ( output a, 
		      output b,
		      output c,
		      output d,
		      output e,
		      input  x,
		      input  y,
		      input  z);

//descrever por expressao
assign a = (x|~z) & (~y|~z);
assign b = (~y|~z) & (~x|~z);
assign c = (x|~y) & (y|~z) & (x|~z); 
assign d = (x|z) & (~y|~z) & (x|~y);
assign e = (x|~y) & (~y|~z) & (~x|~z);

endmodule //simplificado

module Exemplo_02;

//--------------------- definir dados
reg x;
reg y;
reg z;

wire a;
wire b;
wire c;
wire d;
wire e;

wire a2;
wire b2;
wire c2;
wire d2;
wire e2;

tabela moduloTable(a, b, c, d, e, x, y, z);
simplificado moduloSimple(a2, b2, c2, d2, e2, x, y, z);

//------------------------- parte principal

initial 
    begin : main 
    $display("Exemplo_02 - Matheus Santos Rosa Carneiro - 613414");
    $display("Test module Mapa Veitch-Karnaugh");
    $display("X Y Z :  A  A2 B B2  C C2  D D2  E E2");

    //projetar testes do modulo
    $monitor("%b %b %b : %2b %2b %2b %2b %2b %2b %2b %2b %2b %2b", x, y, z, a, a2, b, b2, c, c2, d, d2, e, e2);
        x = 0; y = 0; z = 0;
      #1 x = 0; y = 0; z = 1;
      #1 x = 0; y = 1; z = 0;
      #1 x = 0; y = 1; z = 1;
      #1 x = 1; y = 0; z = 0;
      #1 x = 1; y = 0; z = 1;
      #1 x = 1; y = 1; z = 0;
      #1 x = 1; y = 1; z = 1;

      end
endmodule //Exemplo_02






		 
