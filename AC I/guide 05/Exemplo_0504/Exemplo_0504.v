// -------------------------
// Exemplo_0504 - GATES
// Nome: Matheus Santos Rosa Carneiro
// Matricula: 613414
// -------------------------

module Exemplo_0504();

reg a;
reg b;
wire s, w; //f saida //w circuitos interligados

//duas instancias para o modulo nand

nand U1 ( w, a, b ); //primeira porta nand interligada com x, y
nand U2 ( s, w, w ); //segunda porta nand com a saida final 

//---------------------- parte principal 

initial 
begin : main 
   $display("Exemplo_504 - Matheus Santos Rosa Carneiro - 613414");
   $display("Test module 503");
   // projetar testes do modulo
   $monitor("a = %4b b = %4b s = %4b", a, b, s);

a = 1'b0; b = 1'b0; //equivalente a 0

// #1 unidade de tempo

#1 a = 1'b0; b = 1'b1;
#1 a = 1'b1; b = 1'b0;
#1 a = 1'b1; b = 1'b1;

end

endmodule // Exemplo_0504()
