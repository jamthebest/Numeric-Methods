require './Interpolacion'
class Trazador
	def opc
		puts "---------MENU---------"
		puts "1. Trazador Lineal"
		puts "2. Trazador Cuadratico"
		puts "3. Trazador Cubico"
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
	
	def lineal
		ret = []
		for i in 1..((@x.size/2)-1)
			nu = @x[i*2].to_f
			co = (@x[(i*2)+1].to_f - @x[((i-1)*2)+1].to_f)/(nu - @x[(i-1)*2].to_f)
			op = co >= 0 ? "+" : "-"
			ret[i-1] = "#{@x[(i*2)+1]}#{op}#{co.abs.round 4}(x#{nu<=0 ?"+":"-"}#{nu.abs.to_s})"
		end
		ret
	end
	
	def cuadratica
		
	end
	
	def cubica
		
	end
	
	def run
		op = menu
		while (op != 4)
			f = ""
			ret = ""
			@int = Interpolacion.new
			@x = @int.run
			case op
				when 1
					ret = lineal
			
				when 2
					ret = cuadratica
					
				when 3
					ret = cubica
			end
			mitad = (ret.size/2) - ((ret.size.odd?) ? 0 : 1)
			for i in 0..(ret.size-1)
				f += (mitad==i ? "F(x) = " : "#{" "*7}") + "| #{ret[i]},  #{@x[i*2]} <= x <= #{@x[(i+1)*2]}\n"
			end
			@int.escribir(f)
			op = menu
		end
	end
end
