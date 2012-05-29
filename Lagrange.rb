require './Interpolacion'
class Lagrange
	def men
		puts "Desea salir de la aplicacion? si/no"
		gets.chomp.downcase
	end
	
	def run
		op = ""
		@int = Interpolacion.new
		while !op.eql?("si") && !op.eql?("s")
			@x = @int.run
			ret = fn
			@int.escribir(ret)
			op = men
		end
	end
	
	def l(i)
		num = ""
		deno = 1.0
		for j in (0..@n)
			if(i != j)
				num += "(x#{@x[j*2].to_f < 0 ? "+" : "-"}#{@x[j*2].to_f.abs})"
				deno *= (@x[i*2].to_f - @x[j*2].to_f)
			end
		end
		num + "/" + (deno.round 4).to_s
	end
	
	def fn
		ret = ""
		@n = (@x.size/2)-1
		for i in (0..@n)
			li = l(i)
			indx = li.index "/"
			deno = li[(indx+1)..(li.size-1)].to_f
			nume = @x[i*2+1].to_f / deno
			ret += nume > 0 ? ("+" + (nume.round 4).to_s + li[0..(indx-1)]) : (nume < 0 ? ("-" + (nume.abs.round 4).to_s + li[0..(indx-1)]) : "" )
		end
		if ret[1] == "+"
			return ret[1..(ret.size-1)]
		end
		ret
	end
end
