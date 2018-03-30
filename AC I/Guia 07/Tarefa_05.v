//-------------------------------------
// Guia 07 - Exemplo_05	     	      |
// Nome: Matheus Santos Rosa Carneiro |
// Matricula: 613414		      |
//-------------------------------------

module tabela ( output a,
		input  x,
		input  y,
		input  z);

//descrever por expressao
assign a = ((x & y) & (~x & ~y)) | ((~y | ~z) & x);

endmodule //tabela

module simplificado ( output a,
		      input  x,
		      input  y,
		      input  z);
			

//descrever por expressao
assign a = (x & ~z) | (x & ~y);

endmodule //simplificado

module Exemplo_05;

//--------------------- definir dados
reg x;
reg y;
reg z;

wire a;
wire a2;

tabela moduloTable(a, x, y, z);
simplificado moduloSimple(a2, x, y, z);

//-------------------- parte principal
initial 
   begin : main
   $display("Exemplo_05 - Matheus Santos Rosa Carneiro - 613414");
    $display("Test module Mapa Veitch-Karnaugh");
    $display("X Y Z :  A  A2");

    //projetar testes do modulo
    $monitor("%b %b %b : %2b %2b ", x, y, z, a, a2);

         x = 0; y = 0; z = 0;
      #1 x = 0; y = 0; z = 1;
      #1 x = 0; y = 1; z = 0;
      #1 x = 0; y = 1; z = 1;
      #1 x = 1; y = 0; z = 0;
      #1 x = 1; y = 0; z = 1;
      #1 x = 1; y = 1; z = 0;
      #1 x = 1; y = 1; z = 1;

    end

endmodule //Exemplo_05
