// -------------------------
// Exemplo_0506 - GATES
// Nome: Matheus Santos Rosa Carneiro
// Matricula: 613414
// -------------------------

module Exemplo_0506();

//------------------------ definir dados
reg a;
reg b;
wire s, d, c, a_neg, b_neg; 

//------------------------ definir 5 instancias para nand

nand U1( a_neg, a, a );
nand U2( b_neg, b, b );
nand U3( c, a_neg, b );
nand U4( d, b_neg, a );
nand U5( s, c, d );

//------------------------ parte principal
initial 
begin : main 
   $display("Exemplo_0506 - Matheus Santos Rosa Carneiro - 613414");
   $display("Test module 506");
   // projetar testes no modulo
   $monitor("a = %4b b = %4b s = %4b", a, b, s); 

  a = 1'b0; b = 1'b0;

#1  a = 1'b0; b = 1'b1; 
#1  a = 1'b1; b = 1'b0;
#1  a = 1'b1; b = 1'b1;

end

endmodule // Exemplo_0506()
