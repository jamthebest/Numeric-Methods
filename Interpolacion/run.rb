require './Newton'
require './Lagrange'
require './Trazador'
require './Factorizacion'
def opc
	puts "---------MENU---------"
	puts "1. Metodo de Newton"
	puts "2. Metodo de Lagrange"
	puts "3. Metodo de Trazadores"
	puts "4. Factorizacion LU"
	puts "5. Salir"
	print "Seleccione su opcion: "
	gets.chomp
end

def menu
	op = opc.to_i
	puts ""
	while !((1..5).include? op)
		puts "Opcion Incorrecta!"
		op = opc.to_i
		puts ""
	end
	op
end

op = menu
while (op != 5)
	case op
		when 1
			n = Newton.new
			n.run
		
		when 2
			l = Lagrange.new
			l.run
			
		when 3
			t = Trazador.new
			t.run
			
		when 4
			f = Factorizacion.new
			x = f.run
			if x == nil
				puts "El numero de elementos en la matriz es disparejo"
			else
				for i in 0..(x.size-1)
					puts "X#{i} = #{x[i]}"
				end
			end
	end
	op = menu
end
