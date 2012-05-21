require './Newton'
require './Lagrange'
def opc
	puts "---------MENU---------"
	puts "1. Metodo de Newton"
	puts "2. Metodo de Lagrange"
	puts "3. Metodo de Trazadores"
	puts "4. Salir"
	print "Seleccione su opcion: "
	gets.chomp
end

def menu
	op = opc.to_i
	puts ""
	while !((1..4).include? op)
		puts "Opcion Incorrecta!"
		op = opc.to_i
		puts ""
	end
	op
end

op = menu
while (op != 4)
	case op
		when 1
			n = Newton.new
			n.run
		
		when 2
			l = Lagrange.new
			l.run
	end
	op = menu
end
