// -------------------------
// Exemplo_0502 - GATES
// Nome: Matheus Santos Rosa Carneiro
// Matricula: 613414
// -------------------------

module Exemplo_0502();

//------------------ definir dados

reg a;
reg b;
wire w, z, s;

//quatro instancias para o module nand

nand U1( w, a);
nand U2( z, b);
nand U3( s, w, z );
nand U4( s, z, w );

//------------------------------- parte principal 

initial
begin : main 
   $display("Exemplo_0502 - Matheus Santos Rosa Carneiro - 613414");
   $display("Test module 502");
   // projetar testes do modulo
   $monitor("a = %4b b = %4b s = %4b", a, b, s);

   a = 1'b0; b = 1'b0;

#1 a = 1'b0; b = 1'b1;
#1 a = 1'b1; b = 1'b0;
#1 a = 1'b1; b = 1'b1;

end

endmodule //end Exemplo_0502()
