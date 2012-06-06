class Trapecio
	def initialize(a, b, f, )


	def sumatoria
		ret = 0.0
		for i in 1..(@n-1)
			ret += @f[i]*2
		end
		ret += f[0] + f[@n+1]
	end

	def h
		h = (@b-@a)/@n
	end
end