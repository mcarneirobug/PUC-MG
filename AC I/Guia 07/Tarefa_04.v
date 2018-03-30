//-------------------------------------
// Guia 07 - Exemplo_04		      |
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
		input  w,
		input  z);

//descrever por expressao
assign a = 
assign b = 
assign c =  
assign d = 
assign e = 
	

endmodule//tabela

module simplificado ( output a, 
		      output b,
		      output c,
		      output d,
		      output e,
		      input  x,
		      input  y,
		      input  w,
		      input  z);

//descrever por expressao
assign a = 
assign b = 
assign c = 
assign d = 
assign e = 

endmodule //simplificado

module Exemplo_04;

//--------------------- definir dados
reg x;
reg y;
reg w;
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

tabela moduloTable(a, b, c, d, e, x, y, w, z);
simplificado moduloSimple(a2, b2, c2, d2, e2, x, y, w, z);

//------------------------- parte principal

initial 
    begin : main 
    $display("Exemplo_04 - Matheus Santos Rosa Carneiro - 613414");
    $display("Test module Mapa Veitch-Karnaugh");
    $display("X Y W Z :  A  A2 B B2  C C2  D D2  E E2");

    //projetar testes do modulo
    $monitor("%b %b %b %b : %2b %2b %2b %2b %2b %2b %2b %2b %2b %2b", x, y, w, z, a, a2, b, b2, c, c2, d, d2, e, e2);
          x=0; y=0; w=0; z=0;
      #1  x=0; y=0; w=0; z=1;
      #1  x=0; y=0; w=1; z=0;
      #1  x=0; y=0; w=1; z=1;
      #1  x=0; y=1; w=0; z=0;
      #1  x=0; y=1; w=0; z=1;
      #1  x=0; y=1; w=1; z=0;
      #1  x=0; y=1; w=1; z=1;
      #1  x=1; y=0; w=0; z=0;
      #1  x=1; y=0; w=0; z=1;
      #1  x=1; y=0; w=1; z=0;
      #1  x=1; y=0; w=1; z=1;
      #1  x=1; y=1; w=0; z=0;
      #1  x=1; y=1; w=0; z=1;
      #1  x=1; y=1; w=1; z=0;
      #1  x=1; y=1; w=1; z=1;

      end
endmodule //Exemplo_04






		 
