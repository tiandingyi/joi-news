FROM node:16.18-alpine

COPY ./ ./

RUN npm install


RUN npm run build

# CMD ["npm" "run" "start"]
ENTRYPOINT ["npm", "run","start"]
