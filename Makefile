run:
	emacs -nw ics108.org

emacs:
	emacs ics108.org

vim:
	vim ics108.org

push:
	-git push .
	-git commit -m "auto committed ."
