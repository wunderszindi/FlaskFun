from flask import Flask
import time
from random import random

app = Flask(__name__)

value = random()

@app.route("/")
def hello():
  return "Dávid hozz tejet!"

@app.route("/api/time-now")
def localtime():
  localtime = time.asctime( time.localtime(time.time()) )

  return localtime

@app.route("/api/random-number")
def anything():
    return str(value)